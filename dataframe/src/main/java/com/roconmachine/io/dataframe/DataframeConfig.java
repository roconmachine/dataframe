package com.roconmachine.io.dataframe;




import com.roconmachine.io.dataframe.cdn.client.api.CdnApi;
import com.roconmachine.io.dataframe.fgaccess.client.api.FgAccessApi;
import com.roconmachine.io.dataframe.notification.client.api.NotificationApi;
import com.roconmachine.io.dataframe.payment.client.api.PaymentApi;
import com.roconmachine.io.dataframe.report.client.api.ReportApi;
import com.roconmachine.io.dataframe.state.client.ApiClient;
import com.roconmachine.io.dataframe.state.client.api.StateApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DataframeConfig {

    @Value("${services.cdn.baseUrl}")
    private String cdnUrl;

    @Value("${services.notification.baseUrl}")
    private String notificationUrl;

    @Value("${services.fgaccess.baseUrl}")
    private String fgaccessUrl;

    @Value("${services.payment.baseUrl}")
    private String paymentUrl;


    @Value("${services.report.baseUrl}")
    private String reportUrl;

    @Value("${services.state.baseUrl}")
    private String stateUrl;

    @Bean
    public CdnApi getCdnApi(){
        com.roconmachine.io.dataframe.cdn.client.ApiClient apiClient =
                new com.roconmachine.io.dataframe.cdn.client.ApiClient();
        apiClient.setBasePath(cdnUrl);
        return new CdnApi(apiClient);
    }

    @Bean
    public NotificationApi getNotificationApi(){
        com.roconmachine.io.dataframe.notification.client.ApiClient apiClient =
                new com.roconmachine.io.dataframe.notification.client.ApiClient();
        apiClient.setBasePath(notificationUrl);
        return new NotificationApi(apiClient);
    }


    @Bean
    public FgAccessApi getFgaccess(){
        com.roconmachine.io.dataframe.fgaccess.client.ApiClient apiClient =
                new com.roconmachine.io.dataframe.fgaccess.client.ApiClient();
        apiClient.setBasePath(fgaccessUrl);
        return new FgAccessApi(apiClient);
    }

    @Bean
    public PaymentApi getPaymentApi(){
        com.roconmachine.io.dataframe.payment.client.ApiClient apiClient =
                new com.roconmachine.io.dataframe.payment.client.ApiClient();
        apiClient.setBasePath(paymentUrl);
        return new PaymentApi(apiClient);
    }

    @Bean
    public ReportApi getReportApi(){
        com.roconmachine.io.dataframe.report.client.ApiClient apiClient =
                new com.roconmachine.io.dataframe.report.client.ApiClient();
        apiClient.setBasePath(reportUrl);
        return  new ReportApi(apiClient);
    }

    @Bean
    public StateApi getStateApi(){
        com.roconmachine.io.dataframe.state.client.ApiClient apiClient =
                new com.roconmachine.io.dataframe.state.client.ApiClient();
        apiClient.setBasePath(stateUrl);
        return new StateApi(apiClient);
    }



}
