public class Bars {
    public static void main(String[] args) {
        String str = "01-27 15:43:54.519 31573 31669 I okhttp.OkHttpClient: <-- 200 OK https://test.testru.ru/v1/app (43ms)01-27 15:43:54.519 31573 31669 I okhttp.OkHttpClient: Server: nginx \n" +
                "01-27 15:43:54.519 31573 31669 I okhttp.OkHttpClient: Date: Fri, 27 Jan 2023 12:42:40 GMT01-27 15:43:54.519 31573 31669 I okhttp.OkHttpClient: Content-Type: application/json; charset=utf-8 \n" +
                "01-27 15:43:54.520 31573 31669 I okhttp.OkHttpClient: Transfer-Encoding: chunked01-27 15:43:54.520 31573 31669 I okhttp.OkHttpClient: Connection: keep-alive \n" +
                "01-27 15:43:54.520 31573 31669 I okhttp.OkHttpClient: x-trace-id: 2K1mBa6imNL5hWyLYZUFnp01-27 15:43:54.520 31573 31669 I okhttp.OkHttpClient: api-supported-versions: 1.0 \n" +
                "01-27 15:43:54.520 31573 31669 I okhttp.OkHttpClient: X-Correlation-ID: urn:mva:3KJAFiiOnPUtZPlFoHK:registration:1:6I758sTJYXhqXktrs8co ";
        str = str.lines().filter(i->i.contains("x-trace-id")).findFirst().toString();
        int peremen = str.lastIndexOf("x-trace-id:") + 12;
        System.out.println(str.substring(peremen, peremen + 22));
    }
}
