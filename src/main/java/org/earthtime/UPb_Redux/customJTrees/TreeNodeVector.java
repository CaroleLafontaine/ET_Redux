/*
  * Copyright 2006-2018 James F. Bowring, CIRDLES.org, and Earth-Time.org
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.earthtime.UPb_Redux.customJTrees;

import java.util.Vector;

/**
 *
 * @param <E> 
 * @author http://www.java2s.com/Tutorial/Java/0240__Swing/CreatinganEditorJustforLeafNodes.htm
 */
public class TreeNodeVector<E> extends Vector<E> {

    String name;

    TreeNodeVector(String name) {
        this.name = name;
    }

    TreeNodeVector(String name, E elements[]) {
        this.name = name;
        for (int i = 0,  n = elements.length; i < n; i++) {
            add(elements[i]);
        }
    }

    /**
     * 
     * @return
     */
    public String toString() {
        return "[" + name + "]";
    }
}
