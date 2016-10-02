package com.api.data;

import com.api.domain.TrailInformation;
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
public class TrailInformationRepositoryTest {

    @Autowired
    TrailInformationRepository trailInformationRepository;

    @Test
    public void repoTest(){

        TrailInformation trailInformation = trailInformationRepository.getOne(2l);

        assertThat(trailInformation).isNotNull();
        assertThat(trailInformation.getBar().getName()).isEqualTo("The O");
        assertThat(trailInformation.getNeighborhood().getName()).isEqualTo("Oakland");
    }
}
