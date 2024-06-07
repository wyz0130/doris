// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.nereids.trees.expressions.functions.scalar;

import org.apache.doris.catalog.FunctionSignature;
import org.apache.doris.nereids.exceptions.AnalysisException;
import org.apache.doris.nereids.trees.expressions.Expression;
import org.apache.doris.nereids.trees.expressions.literal.StringLiteral;
import org.apache.doris.nereids.trees.expressions.visitor.ExpressionVisitor;
import org.apache.doris.nereids.types.StringType;
import org.apache.doris.nereids.types.VarcharType;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * ScalarFunction 'sm4_decrypt'. This class is generated by GenerateFunction.
 */
public class Sm4Decrypt extends Sm4CryptoFunction {

    public static final List<FunctionSignature> SIGNATURES = ImmutableList.of(
            FunctionSignature.ret(VarcharType.SYSTEM_DEFAULT)
                    .args(VarcharType.SYSTEM_DEFAULT, VarcharType.SYSTEM_DEFAULT),
            FunctionSignature.ret(StringType.INSTANCE).args(StringType.INSTANCE, StringType.INSTANCE),
            FunctionSignature.ret(VarcharType.SYSTEM_DEFAULT)
                    .args(VarcharType.SYSTEM_DEFAULT,
                            VarcharType.SYSTEM_DEFAULT,
                            VarcharType.SYSTEM_DEFAULT),
            FunctionSignature.ret(StringType.INSTANCE)
                    .args(StringType.INSTANCE,
                            StringType.INSTANCE,
                            StringType.INSTANCE),
            FunctionSignature.ret(VarcharType.SYSTEM_DEFAULT)
                    .args(VarcharType.SYSTEM_DEFAULT,
                            VarcharType.SYSTEM_DEFAULT,
                            VarcharType.SYSTEM_DEFAULT,
                            VarcharType.SYSTEM_DEFAULT),
            FunctionSignature.ret(StringType.INSTANCE)
                    .args(StringType.INSTANCE,
                            StringType.INSTANCE,
                            StringType.INSTANCE,
                            StringType.INSTANCE)
    );

    /**
     * constructor with 2 arguments.
     */
    public Sm4Decrypt(Expression arg0, Expression arg1) {
        // if there are only 2 params, we need add an empty string as the third param
        // and set encryption mode to SM4_128_ECB
        // this keeps the behavior consistent with old doris ver.
        super("sm4_decrypt", arg0, arg1, new StringLiteral(""), new StringLiteral("SM4_128_ECB"));

        // check if encryptionMode from session variables is valid
        StringLiteral encryptionMode = CryptoFunction.getDefaultBlockEncryptionMode("SM4_128_ECB");
        if (!SM4_MODES.contains(encryptionMode.getValue())) {
            throw new AnalysisException(
                    "session variable block_encryption_mode is invalid with sm4");
        }
    }

    /**
     * constructor with 3 arguments.
     */
    public Sm4Decrypt(Expression arg0, Expression arg1, Expression arg2) {
        super("sm4_decrypt", arg0, arg1, arg2, getDefaultBlockEncryptionMode());
    }

    public Sm4Decrypt(Expression arg0, Expression arg1, Expression arg2, Expression arg3) {
        super("sm4_decrypt", arg0, arg1, arg2, arg3);
    }

    /**
     * withChildren.
     */
    @Override
    public Sm4Decrypt withChildren(List<Expression> children) {
        Preconditions.checkArgument(children.size() >= 2 && children.size() <= 4);
        if (children.size() == 2) {
            return new Sm4Decrypt(children.get(0), children.get(1));
        } else if (children().size() == 3) {
            return new Sm4Decrypt(children.get(0), children.get(1), children.get(2));
        } else {
            return new Sm4Decrypt(children.get(0), children.get(1), children.get(2), (StringLiteral) children.get(3));
        }
    }

    @Override
    public List<FunctionSignature> getSignatures() {
        return SIGNATURES;
    }

    @Override
    public <R, C> R accept(ExpressionVisitor<R, C> visitor, C context) {
        return visitor.visitSm4Decrypt(this, context);
    }
}