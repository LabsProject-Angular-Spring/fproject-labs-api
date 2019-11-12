package labsproject.api.feign;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;

import feign.form.spring.SpringFormEncoder;

import labsproject.api.entity.User;

@FeignClient(name = "user-api", url = "localhost:10020")

public interface UserFeign {
    @PostMapping(value = "/user/login", consumes = {"application/json"} )
    User login(@RequestBody Map<String, Object> payload);
    
    class Configuration {
        @Bean
        SpringFormEncoder feignFormEncoder(ObjectFactory<HttpMessageConverters> converters) {
            return new SpringFormEncoder(new SpringEncoder(converters));
        }
    }
}
