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
package com.netflix.imfutility.itunes.xmlprovider.builder.file;

import com.netflix.imfutility.generated.itunes.metadata.AttributeNameType;
import com.netflix.imfutility.generated.itunes.metadata.AttributeType;
import com.netflix.imfutility.generated.itunes.metadata.DataFileRoleType;
import com.netflix.imfutility.generated.itunes.metadata.DataFileType;
import com.netflix.imfutility.generated.itunes.metadata.LocaleType;

import java.io.File;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Builder for creating iTunes data_file metadata info for asset file.
 * Also generates MD5 hash for input.
 * (see {@link DataFileType}).
 */
public class DataFileTagBuilder extends FileTagBuilder<DataFileType> {
    private static final AttributeNameType[] CROP_ATTRIBUTE_NAMES = new AttributeNameType[]{
            AttributeNameType.CROP_TOP,
            AttributeNameType.CROP_BOTTOM,
            AttributeNameType.CROP_LEFT,
            AttributeNameType.CROP_RIGHT};

    private final CheckSumTagBuilder checkSumBuilder;

    private DataFileRoleType role;
    private LocaleType locale;
    private boolean cropToZero;

    public DataFileTagBuilder(File assetFile, String fileName) {
        super(assetFile, fileName);
        this.checkSumBuilder = new CheckSumTagBuilder(assetFile);
    }

    public DataFileTagBuilder setRole(DataFileRoleType role) {
        this.role = role;
        return this;
    }

    public DataFileTagBuilder setLocale(LocaleType locale) {
        this.locale = locale;
        return this;
    }

    public DataFileTagBuilder setCropToZero(boolean cropToZero) {
        this.cropToZero = cropToZero;
        return this;
    }

    @Override
    public DataFileType build() {
        DataFileType dataFile = new DataFileType();
        dataFile.setRole(role);
        dataFile.setLocale(locale);
        dataFile.setFileName(fileName);
        dataFile.setSize(BigInteger.valueOf(assetFile.length()));
        dataFile.setChecksum(checkSumBuilder.build());
        if (cropToZero) {
            dataFile.getAttribute().addAll(buildZeroCrops());
        }
        return dataFile;
    }

    private List<AttributeType> buildZeroCrops() {
        return Arrays.stream(CROP_ATTRIBUTE_NAMES)
                .map(this::buildZeroCrop)
                .collect(Collectors.toList());
    }

    private AttributeType buildZeroCrop(AttributeNameType attributeName) {
        AttributeType attribute = new AttributeType();
        attribute.setValue(String.valueOf(0));
        attribute.setName(attributeName);
        return attribute;
    }
}
