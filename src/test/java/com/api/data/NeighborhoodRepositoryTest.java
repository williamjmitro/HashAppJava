package com.api.data;

import com.api.domain.Neighborhood;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by Porn Again Christian PRATH3 on 10/2/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class NeighborhoodRepositoryTest {

    @Autowired
    NeighborhoodRepository neighborhoodRepository;

    @Test
    public void repoTest(){

        Neighborhood neighborhood = neighborhoodRepository.getByName("Dormont");

        assertThat(neighborhood.getNeighborhoodId()).isEqualTo(10);
    }
}
