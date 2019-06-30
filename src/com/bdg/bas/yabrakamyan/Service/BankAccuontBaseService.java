package com.bdg.bas.yabrakamyan.Service;

import com.bdg.bas.yabrakamyan.entity.AbstractBankEntity;

public interface BankAccuontBaseService <T extends AbstractBankEntity, R> {

    T create(R request);
}
