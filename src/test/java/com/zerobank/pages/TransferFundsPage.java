package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsPage {





    public TransferFundsPage(){
        PageFactory.initElements(Driver.get(), this);
    }
}
