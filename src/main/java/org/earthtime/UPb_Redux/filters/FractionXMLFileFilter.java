/*
 * FractionXMLFileFilter.java
 *
 * Created on September 22, 2006, 4:54 AM
 *
 *
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

package org.earthtime.UPb_Redux.filters;

import java.io.File;

/**
 *
 * @author James F. Bowring
 */
public class FractionXMLFileFilter implements java.io.FileFilter {
    
    /** Creates a new instance of FractionXMLFileFilter */
    public FractionXMLFileFilter() {
    }
    
    /**
     * 
     * @param f
     * @return
     */
    public boolean accept(File f) {
        if (f.getName().toLowerCase().endsWith(".xml"))
            return true;
        else
            return false;
    }//end accept
}
