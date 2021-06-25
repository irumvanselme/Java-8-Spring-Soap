package rw.ac.rca.java8springsoap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.WsdlDefinition;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;


@EnableWs //Enable Spring Web Services
@Configuration //Spring Configuration
public class WebServiceConfig {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet messageDispatcherServlet = new MessageDispatcherServlet();
        messageDispatcherServlet.setApplicationContext(context);
        messageDispatcherServlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(messageDispatcherServlet, "/ws/anselme/*");
    }

    // /ws/anselme/students.wsdl
    @Bean(name = "items")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema itemsSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("ItemsPort");
        definition.setTargetNamespace("https://rca.ac.rw/anselme/soap-app");
        definition.setLocationUri("/ws");
        definition.setSchema(itemsSchema);
        return definition;
    }

    @Bean(name = "suppliers")
    public WsdlDefinition coursesDefinition(XsdSchema supplierSchema){
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("SuppliersPort");
        definition.setTargetNamespace("https://rca.ac.rw/anselme/soap-app");
        definition.setLocationUri("/ws");
        definition.setSchema(supplierSchema);
        return definition;
    }

    @Bean
    public XsdSchema supplierSchema() {
        return new SimpleXsdSchema(new ClassPathResource("supplier-details.xsd"));
    }

    @Bean
    public XsdSchema itemsSchema() {
        return new SimpleXsdSchema(new ClassPathResource("items-details.xsd"));
    }
}