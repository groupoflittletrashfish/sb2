package com.noname.sb2.aware;

import org.springframework.beans.factory.Aware;

public interface MyAware extends Aware {

    void setFlag(Flag flag);
}
