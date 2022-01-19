package com.noname.sb2.aware;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author ：liwuming
 * @date ：Created in 2022/1/19 13:08
 * @description ：
 * @modified By：
 * @version:
 */
@Component
@Data
public class Flag {

    private boolean canOperate = false;
}
