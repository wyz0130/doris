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

package org.apache.doris.common;

// This is a generated file, DO NOT EDIT IT.
// To change this file, see gensrc/script/gen_build_version.sh
// the file should be placed in src/java/org/apache/doris/common/Version.java

public class Version {

  public static final String DORIS_BUILD_VERSION_PREFIX = "doris";
  public static final int DORIS_BUILD_VERSION_MAJOR = 2;
  public static final int DORIS_BUILD_VERSION_MINOR = 1;
  public static final int DORIS_BUILD_VERSION_PATCH = 3;
  public static final String DORIS_BUILD_VERSION_RC_VERSION = "rc09";

  public static final String DORIS_BUILD_VERSION = "doris-2.1.3-rc09";
  public static final String DORIS_BUILD_HASH = "file://e1fdce03ea67@Unknown";
  public static final String DORIS_BUILD_SHORT_HASH = "Unknown";
  public static final String DORIS_BUILD_TIME = "Mon, 20 May 2024 06:38:32 UTC";
  public static final String DORIS_BUILD_INFO = "e1fdce03ea67";
  public static final String DORIS_JAVA_COMPILE_VERSION = "openjdk full version \"1.8.0_402-b06\"";

  public static void main(String[] args) {
    System.out.println("doris_build_version_prefix: " + DORIS_BUILD_VERSION_PREFIX);
    System.out.println("doris_build_version_major: " + DORIS_BUILD_VERSION_MAJOR);
    System.out.println("doris_build_version_minor: " + DORIS_BUILD_VERSION_MINOR);
    System.out.println("doris_build_version_patch: " + DORIS_BUILD_VERSION_PATCH);
    System.out.println("doris_build_version_rc_version: " + DORIS_BUILD_VERSION_RC_VERSION);

    System.out.println("doris_build_version: " + DORIS_BUILD_VERSION);
    System.out.println("doris_build_hash: " + DORIS_BUILD_HASH);
    System.out.println("doris_build_short_hash: " + DORIS_BUILD_SHORT_HASH);
    System.out.println("doris_build_time: " + DORIS_BUILD_TIME);
    System.out.println("doris_build_info: " + DORIS_BUILD_INFO);
    System.out.println("doris_java_compile_version: " + DORIS_JAVA_COMPILE_VERSION);
  }

}
