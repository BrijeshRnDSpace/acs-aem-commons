/*
 * #%L
 * ACS AEM Commons Bundle
 * %%
 * Copyright (C) 2013 Adobe
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.adobe.acs.commons.models.injectors.impl.model;

import com.adobe.acs.commons.models.injectors.impl.model.impl.TestJsonObject;

import java.util.List;
import java.util.Set;


public interface TestJsonObjectInjection {
    TestJsonObject getTestJsonObject();

    List<TestJsonObject> getTestJsonObjectList();

    Set<TestJsonObject> getTestJsonObjectSet();

    TestJsonObject[] getTestJsonObjectArray();

    TestJsonObject getTestJsonObjectEmpty();

    List<TestJsonObject> getTestJsonObjectListEmpty();

    Set<TestJsonObject> getTestJsonObjectSetEmpty();

    TestJsonObject[] getTestJsonObjectArrayEmpty();
}