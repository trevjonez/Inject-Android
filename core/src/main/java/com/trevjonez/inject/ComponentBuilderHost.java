/*
 * Copyright 2016 Trevor Jones
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

package com.trevjonez.inject;

/**
 * For usage with less frequent android platform types such as services, or other general purpose usage.
 *
 * @author TrevJonez
 */
public interface ComponentBuilderHost {
    /**
     * @param key         map lookup key, typically the injection target type of the component
     * @param builderType expected builder type to be returned
     * @param <T>         injection target type of component produced by returned builder
     * @param <B>         expected builder type for the given key
     * @return a new component builder associated with key type
     */
    <T, B extends ComponentBuilder<T, ? extends PlainComponent<T>>> B getComponentBuilder(Class<T> key, Class<B> builderType);
}
