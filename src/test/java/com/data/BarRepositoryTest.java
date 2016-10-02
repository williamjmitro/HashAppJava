package com.data;

import com.domain.Bar;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by Porn Again Christian PRATH3 on 9/27/2016.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class BarRepositoryTest {


    @Autowired
    BarRepository barRepository;

    @Test
    public void barTest(){


        Bar bar = barRepository.findByName("Bloomfield Bridge Tavern");
        bar.toString();
        assertThat(bar).isNotNull();
        assertThat(bar.getBarId()).isEqualTo(7);

    }


}
