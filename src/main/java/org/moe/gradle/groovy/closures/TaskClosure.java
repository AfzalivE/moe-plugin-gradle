/*
Copyright (C) 2016 Migeran

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.gradle.groovy.closures;

import org.gradle.api.Task;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;

/**
 * Closure helper class for working with Gradle's task creation closures.
 */
public abstract class TaskClosure<T extends Task> extends ConfigurationClosure<T> {

    protected TaskClosure(@NotNull Object owner) {
        super(Require.nonNull(owner));
    }

    public abstract void doCall(T task);
}
