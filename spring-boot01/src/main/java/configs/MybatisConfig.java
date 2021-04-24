package configs;


import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

    @Bean
    public MybatisPlusInterceptor paginationInterceptor(){

        MybatisPlusInterceptor mybatisPlusInterceptor=new MybatisPlusInterceptor();

        PaginationInnerInterceptor paginationInnerInterceptor=new PaginationInnerInterceptor();
        paginationInnerInterceptor.setOverflow(true);

        mybatisPlusInterceptor.addInnerInterceptor(paginationInnerInterceptor);
        return mybatisPlusInterceptor;


    }





}
