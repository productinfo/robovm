/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
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
 */
package org.robovm.apple.coremedia;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CMBlockBufferFlag/*</name>*/ extends Bits</*<name>*/CMBlockBufferFlag/*</name>*/> {
    /*<values>*/
    public static final CMBlockBufferFlag AssureMemoryNow = new CMBlockBufferFlag(1L);
    public static final CMBlockBufferFlag AlwaysCopyData = new CMBlockBufferFlag(2L);
    public static final CMBlockBufferFlag DontOptimizeDepth = new CMBlockBufferFlag(4L);
    public static final CMBlockBufferFlag PermitEmptyReference = new CMBlockBufferFlag(8L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/CMBlockBufferFlag/*</name>*/[] values = _values(/*<name>*/CMBlockBufferFlag/*</name>*/.class);

    public /*<name>*/CMBlockBufferFlag/*</name>*/(long value) { super(value); }
    private /*<name>*/CMBlockBufferFlag/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CMBlockBufferFlag/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CMBlockBufferFlag/*</name>*/(value, mask);
    }
    protected /*<name>*/CMBlockBufferFlag/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CMBlockBufferFlag/*</name>*/[] values() {
        return values.clone();
    }
}