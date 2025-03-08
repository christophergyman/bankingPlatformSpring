package org.ada.tradingplatform;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class TradingPlatformApplication {
    // main function to run the spring rest api webserver client
    public static void main(String[] args) {
        SpringApplication.run(TradingPlatformApplication.class, args);
    }


    // initial hello router
    @GetMapping("/hello")
    public String hello (@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello %s!", name);
    }

    @GetMapping("/stockPrice")
    public String stockPrice (@RequestParam(value = "nasdaqID", defaultValue = "SPY") String nasdaqID){
        float defaultStockprice = 10.2f;
        return String.format("{\"id\":\"1\", \"nasdaqID\":\"%s\", \"defaultStockPrice\":\"%f\"}", nasdaqID, defaultStockprice);
    }

    @GetMapping("/jsonStockPrice")
    public DefaultResponse defaultResponse(@RequestParam(value = "This company is amazing", defaultValue = "this company stinks") String stockInformation){
        return new DefaultResponse(1, stockInformation);
    }
}

