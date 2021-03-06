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
package com.netflix.imfutility.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Describes FFmpeg audio channels.
 */
public enum FFmpegAudioChannels {
    FL("front left"),
    FR("front right"),
    FC("front center"),
    LFE("low frequency"),
    BL("back left"),
    BR("back right"),
    FLC("front left-of-center"),
    FRC("front right-of-center"),
    BC("back center"),
    SL("side left"),
    SR("side right"),
    TC("top center"),
    TFL("top front left"),
    TFC("top front center"),
    TFR("top front right"),
    TBL("top back left"),
    TBC("top back center"),
    TBR("top back right"),
    DL("downmix left"),
    DR("downmix right"),
    WL("wide left"),
    WR("wide right"),
    SDL("surround direct left"),
    SDR("surround direct right"),
    LFE2("low frequency 2");

    private static final String SEPARATOR = "+";

    public static FFmpegAudioChannels[] toFFmpegAudioChannels(String channelLayout) {
        String[] channels = channelLayout.split("\\" + SEPARATOR);
        List<FFmpegAudioChannels> ffmpegChannels = new ArrayList<>();
        for (String channel : channels) {
            ffmpegChannels.add(FFmpegAudioChannels.valueOf(channel.toUpperCase()));
        }
        return ffmpegChannels.toArray(new FFmpegAudioChannels[]{});
    }

    public static String toChannelsLayoutString(FFmpegAudioChannels[] ffmpegChannels) {
        return Arrays.stream(ffmpegChannels)
                .map(FFmpegAudioChannels::name)
                .collect(Collectors.joining(SEPARATOR));
    }

    public static String toChannelsLayoutString(Collection<FFmpegAudioChannels> ffmpegChannels) {
        return toChannelsLayoutString(ffmpegChannels.toArray(new FFmpegAudioChannels[]{}));
    }

    private final String description;

    FFmpegAudioChannels(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name() + " - " + description;
    }
}
