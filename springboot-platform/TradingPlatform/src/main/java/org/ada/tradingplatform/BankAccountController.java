package org.ada.tradingplatform;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountController {
    @GetMapping("BankAccountGet")
    public String bankAccountGet( @RequestParam(value = "bankID", defaultValue = "0") long bankID){
        return String.format("bank details of: %d", bankID);
    }

    @PostMapping("BankAccountDelete")
    public String bankAccountDelete( @RequestParam(value = "bankID", defaultValue = "0") long bankID ){
        return String.format("delete bank account:%d", bankID);
    }

    @PostMapping("transfer")
    public String transfer( @RequestParam( value = "transferAmount", defaultValue = "0") long transferAmount ){
        return String.format("delete bank account:%d", transferAmount);
    }

}
