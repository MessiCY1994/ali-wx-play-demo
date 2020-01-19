package com.messiyang.aliwxplaydemo.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101700711177";

	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQC98S3rac9As9gMdPPLNPEg7mAuXZGl+NLVf0qDwffV0eTjxFsEqHUns5Rmf65OqJTKpy7s36qoafAbh3zziS+bYXVFCihYbtP30A/1Rv4E8/f/bZFle5wrs325IU00OUBKcUwGJdBLwcjBpb08aEJoZYBlPBiPvEoilrTnbSrjfLa7G36+EkbCxEZVRNYLkg6Cs8LWFN/y52wA1Y0Yxt11TWt89qZdU3gRPXv7fA3+CRYKNTL8swSO0yPFTfCMjfcFrkAFZtHvhs7fOP/Lpa9712PO9qB6doSdLCeR2WhLyN0WRFGgaz9y5MqxVcYdVKJ/21vOAC439nHehZ+6V0n1AgMBAAECggEAN2fb2jjSMPCFDBUtbFA0KkP+oGfA7aYocgightCU57VDTEFhv3kYO42Bs2h5Qw6f4IFmCciwslG8rXsXMr8IuQ1ztMDixfEGOdpiXUzpGi7EX6jpaa3l/0VrXg5dw+cTXuOvpndvTDnpwrsC+VT8UhGRo3YlQABPq8lEWeGZSiP9Ma8XQjGeCNOk7U++kshyiVGix8/jotvQvHoSJ3r3uoNtF8xBbk61qFCvhnqU1tsHlzKkl5Bd7lHA1XiiK1CiYWIjuKeTgr/sz0QYSZ6oDkMqRhjR2K58iq29Dt6aU7KbGz46DhchuXP4kBU4cMWS1ph0EF7my4lg70G8QE+SnQKBgQDmKRwRTEQPh859N9naMWeXGJ1xVUIw1UPpBwt32qpYUn1Xl9Bc9q/I9Tjf2DijBbb07XBpNtVKKq/oZVl+birhLxqTMOBSo/UQfoQ3YR30dbZDiXh7e2CuLPkM9cpN2pJM+b7nW5pSJjACDIsxYp+JuK3sfyZO2CWLwLaC7JX/NwKBgQDTRC10NAv/8gW846p8jFX4Y23vkTRyhhxpurgkyE6j/w5hAx1MU3mD+do3Jv+Bt0Eu+CCPoB3n1O+lmrkBx8nk0Axh15MYns2mBD22z3zEeq8DJFySz6Ytu8M13bGksG8acdvkQjPL/OKbupTtwRhHBAKIrGA2CVHdCsVpFFseMwKBgQCpsT+XZVJ83NUaL1Z4b5p/pU9XYtPVazeRlHcZG+giDFeLgEvIbry1/k67gxBm6Wy18mXBvQLOluBxCGBOPe1xbyg5w3xwkZ+6VH0o03qhZTRHYRCqghGK+W955bINaowZIr1kmH4T+UHGEPeDJsKXaMkap7hXwzcTbbdimgoRSwKBgQCE2g6rUD9rh8pL6e6/u5AkToJHcExG6EbdxekeWEf7oNxt7QNzh9qWP3wVypRKAe8fljEDoHCt5J1+yjklAXnYRWxD6sg5Z0Ny7p/QYdHXzD5Z/3enaqTZhYVQTkTzh2+WdZsNgwQHdtMZks8sY4zcu4zMXXlzAZFVKvzRA1f5OQKBgQDifbVtMS2AtFflKvmhMY4WrwHcKPLZ2rxfIIgLf9QMatuw6n7yVAYeX4FReicDSja/TGRIuz+XW1w0rxNGYrkAbJKGZvnOvzgcgtso9Qhw8ceREVMBNR/6bqj8/4Z5AU0rFXtRRCKbUIoz07Ka9utRiy++v88KnfouncsPAbwszQ==";

	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAj8+jYMGPZ97yIwYeW+AXul127wWdrogFpfVpQPgIy6ru9eFwkuFidpqlBbbJyiFmc6rq1/zT3mmui/3bHYS1ETxF1Wp68Lf1wmWeORusOLT4/7vr3p+ZJHEswAFLouryZuT6WWnVEORtn1RHNhQfElEV/ZWC6oKu0hQqbpqCrD7TjE8/vwRZQPrHMmexL1o/6cAJI4eF4DuGJQUMywztz1HZ7SOQ45GmU21IRqiCDatSnzzAmnqz6qV+urX5k6ym/93V7Fk1SqeVkEHf41MMbdlgp6t3D3BiwccAr98Db+V8RsXC5/Oagwgro6EeZXe3JNQUdHErvgAbPd6Hm5xAtwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8015/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8015/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

