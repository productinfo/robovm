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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.audiotoolbox.*;
import org.robovm.apple.mediatoolbox.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
@Marshaler(AVAudioSessionCategory.Marshaler.class)
/*<annotations>*/@Library("AVFoundation")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioSessionCategory/*</name>*/ 
    extends /*<extends>*/Object/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Marshaler {
        @MarshalsPointer
        public static AVAudioSessionCategory toObject(Class<AVAudioSessionCategory> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVAudioSessionCategory.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVAudioSessionCategory o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    
    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(AVAudioSessionCategory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    public static final AVAudioSessionCategory Ambient = new AVAudioSessionCategory("AmbientValue");
    public static final AVAudioSessionCategory SoloAmbient = new AVAudioSessionCategory("SoloAmbientValue");
    public static final AVAudioSessionCategory Playback = new AVAudioSessionCategory("PlaybackValue");
    public static final AVAudioSessionCategory Record = new AVAudioSessionCategory("RecordValue");
    public static final AVAudioSessionCategory PlayAndRecord = new AVAudioSessionCategory("PlayAndRecordValue");
    public static final AVAudioSessionCategory AudioProcessing = new AVAudioSessionCategory("AudioProcessingValue");
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final AVAudioSessionCategory MultiRoute = new AVAudioSessionCategory("MultiRouteValue");
    
    private static AVAudioSessionCategory[] values = new AVAudioSessionCategory[] {Ambient, SoloAmbient, Playback, Record, 
        PlayAndRecord, AudioProcessing, MultiRoute};
    private final LazyGlobalValue<NSString> lazyGlobalValue;
    
    private AVAudioSessionCategory(String getterName) {
        lazyGlobalValue = new LazyGlobalValue<>(getClass(), getterName);
    }
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    public NSString value() {
        return lazyGlobalValue.value();
    }
    
    public static AVAudioSessionCategory valueOf(NSString value) {
        for (AVAudioSessionCategory v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVAudioSessionCategory/*</name>*/.class.getName());
    }
    /*<methods>*/
    @GlobalValue(symbol="AVAudioSessionCategoryAmbient", optional=true)
    protected static native NSString AmbientValue();
    @GlobalValue(symbol="AVAudioSessionCategorySoloAmbient", optional=true)
    protected static native NSString SoloAmbientValue();
    @GlobalValue(symbol="AVAudioSessionCategoryPlayback", optional=true)
    protected static native NSString PlaybackValue();
    @GlobalValue(symbol="AVAudioSessionCategoryRecord", optional=true)
    protected static native NSString RecordValue();
    @GlobalValue(symbol="AVAudioSessionCategoryPlayAndRecord", optional=true)
    protected static native NSString PlayAndRecordValue();
    @GlobalValue(symbol="AVAudioSessionCategoryAudioProcessing", optional=true)
    protected static native NSString AudioProcessingValue();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalValue(symbol="AVAudioSessionCategoryMultiRoute", optional=true)
    protected static native NSString MultiRouteValue();
    /*</methods>*/
}
