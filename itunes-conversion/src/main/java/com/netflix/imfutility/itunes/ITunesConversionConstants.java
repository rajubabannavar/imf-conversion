/*
 * Copyright (C) 2016 Netflix, Inc.
 *
 *     This file is part of IMF Conversion Utility.
 *
 *     IMF Conversion Utility is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     IMF Conversion Utility is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with IMF Conversion Utility.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.netflix.imfutility.itunes;

/**
 * CoreConstants related to iTunes format.
 */
public final class ITunesConversionConstants {

    private ITunesConversionConstants() {
    }

    /* 1. Conversion.xml */

    // 1.1. conversion.xml location
    public static final String CONVERSION_XML = "xml/conversion.xml";

    // 1.2 dynamic parameters:
    public static final String DYNAMIC_PARAM_OUTPUT_ITMSP = "output";
    public static final String DYNAMIC_PARAM_VENDOR_ID = "vendorId";
    public static final String DYNAMIC_PARAM_METADATA_XML = "metadata";
    public static final String DYNAMIC_PARAM_TRAILER_MEDIAINFO_INPUT = "trailerMediaInfoInput";
    public static final String DYNAMIC_PARAM_TRAILER_MEDIAINFO_OUTPUT = "trailerMediaInfoOutput";


}
