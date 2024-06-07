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

package org.apache.doris.nereids.pattern.generator.javaast;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;

import java.util.List;

/** java class or interface's type. */
public class ClassOrInterfaceType implements JavaAstNode {
    public final List<IdentifyTypeArgumentsPair> identifyTypeArguments;

    public ClassOrInterfaceType(List<IdentifyTypeArgumentsPair> identifyTypeArguments) {
        this.identifyTypeArguments = ImmutableList.copyOf(identifyTypeArguments);
    }

    @Override
    public String toString() {
        return Joiner.on(".").join(identifyTypeArguments);
    }
}
