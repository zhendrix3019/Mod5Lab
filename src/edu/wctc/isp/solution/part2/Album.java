package edu.wctc.isp.solution.part2;

import java.time.Duration;

public interface Album extends edu.wctc.isp.solution.part2.Product {

    String getArtist();

    Duration getPlayingTime();

}