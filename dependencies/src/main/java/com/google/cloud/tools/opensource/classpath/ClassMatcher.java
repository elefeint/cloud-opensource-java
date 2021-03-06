/*
 * Copyright 2020 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.tools.opensource.classpath;

/** Matcher on class names. */
class ClassMatcher implements SymbolProblemTargetMatcher, SymbolProblemSourceMatcher {

  private final String className;

  ClassMatcher(String className) {
    this.className = className;
  }

  @Override
  public boolean match(Symbol symbol) {
    return symbol.getClassBinaryName().equals(className);
  }

  @Override
  public boolean match(ClassFile sourceClass) {
    return sourceClass.getBinaryName().equals(className);
  }
}
