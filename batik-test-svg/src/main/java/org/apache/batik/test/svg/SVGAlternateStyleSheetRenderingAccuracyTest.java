/*

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package org.apache.batik.test.svg;

import org.apache.batik.transcoder.image.ImageTranscoder;
import org.apache.batik.transcoder.image.PNGTranscoder;

/**
 * Checks for regressions in rendering of a document with a given
 * alternate stylesheet.
 *
 * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a>
 * @version $Id$
 */
public class SVGAlternateStyleSheetRenderingAccuracyTest
    extends ParametrizedRenderingAccuracyTest {
    /**
     * Returns the <code>ImageTranscoder</code> the Test should
     * use
     */
    public ImageTranscoder getTestImageTranscoder(){
        ImageTranscoder t = super.getTestImageTranscoder();
        t.addTranscodingHint(PNGTranscoder.KEY_ALTERNATE_STYLESHEET,
                             parameter);
        return t;
    }

}
