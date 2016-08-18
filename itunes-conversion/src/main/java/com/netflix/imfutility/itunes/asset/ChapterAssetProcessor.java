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
package com.netflix.imfutility.itunes.asset;

import com.netflix.imfutility.generated.itunes.metadata.ArtWorkFileType;
import com.netflix.imfutility.generated.itunes.metadata.ChapterInputType;
import com.netflix.imfutility.itunes.asset.distribute.CopyAssetStrategy;
import com.netflix.imfutility.itunes.image.ImageValidator;
import com.netflix.imfutility.itunes.xmlprovider.MetadataXmlProvider;
import com.netflix.imfutility.itunes.xmlprovider.builder.file.ArtWorkFileTagBuilder;
import org.apache.commons.math3.fraction.BigFraction;

import java.io.File;

import static com.netflix.imfutility.itunes.asset.AssetProcessorConstants.CHAPTER_MAX_INDEX;
import static com.netflix.imfutility.itunes.asset.AssetProcessorConstants.CHAPTER_MIN_INDEX;
import static com.netflix.imfutility.itunes.asset.AssetProcessorConstants.CHAPTER_MIN_WIDTH;
import static com.netflix.imfutility.itunes.asset.AssetProcessorConstants.CHAPTER_TYPE;

/**
 * Asset processor specified for chapter image managing.
 */
public class ChapterAssetProcessor extends AssetProcessor<ArtWorkFileType> {

    private Integer chapterIndex;
    private ChapterInputType inputChapter;
    private BigFraction aspectRatio;

    public ChapterAssetProcessor(MetadataXmlProvider metadataXmlProvider, File destDir) {
        super(metadataXmlProvider, destDir);
        setDistributeAssetStrategy(new CopyAssetStrategy());
    }

    public ChapterAssetProcessor setChapterIndex(Integer chapterIndex) {
        this.chapterIndex = chapterIndex;
        return this;
    }

    public ChapterAssetProcessor setInputChapter(ChapterInputType inputChapter) {
        this.inputChapter = inputChapter;
        return this;
    }

    public ChapterAssetProcessor setAspectRatio(BigFraction aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }

    @Override
    protected boolean checkMandatoryParams() {
        return chapterIndex != null
                && !(chapterIndex < CHAPTER_MIN_INDEX || chapterIndex > CHAPTER_MAX_INDEX)
                && aspectRatio != null
                && inputChapter != null;
    }

    @Override
    protected void validate(File assetFile) throws AssetValidationException {
        ImageValidator validator = new ImageValidator(assetFile, CHAPTER_TYPE);
        //  validate only chapter width
        validator.validateSize(CHAPTER_MIN_WIDTH, null);
        validator.validateAspectRatio(aspectRatio);
        validator.validateJpeg();
        validator.validateRGBColorSpace();
    }

    @Override
    protected ArtWorkFileType buildMetadata(File assetFile) {
        return new ArtWorkFileTagBuilder(assetFile, getDestFileName(assetFile)).build();
    }

    @Override
    protected void appendMetadata(ArtWorkFileType tag) {
        metadataXmlProvider.appendChapter(tag, inputChapter);
    }

    @Override
    protected String getDestFileName(File assetFile) {
        return "chapter" + String.format("%02d", chapterIndex) + ".jpg";
    }
}
