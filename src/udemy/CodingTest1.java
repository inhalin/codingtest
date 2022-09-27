package udemy;

/*
n개의 ip 할당 가능
query 는 request, release 두가지
ip 할당 내역 없으면 비어있는 ip 중 가장 작은 값 할당
ip 할당 내역 있으면 가장 마지막에 받은 ip 주소 재할당, 해당 ip 불가하면 비어있는 ip 중 가장 작은 값 할당

1 <= n <= 1000
1 <= 컴퓨터수 <= 10

Example
Input
["desktop1 request",
"desktop2 request",
"desktop3 request",
"desktop3 request",
"desktop1 release",
"desktop3 request"]

Output
["desktop1 168.1.0.1",
"desktop2 168.1.0.2",
"desktop1 rejected",
"desktop1 rejected",
"desktop3 168.1.0.1"]
 */
class CodingTest1 {
    static int[] latestIP = new int[10];
    static int limit;

    public String[] allocateIP(int ip, String[] queries) {
        limit = ip;
        for (int i = 0; i < queries.length; i++) {
            String computer = queries[i].split(" ")[0];
            int comNo = computer.charAt(computer.length() - 1) - 48;
            String query = queries[i].split(" ")[1];

            System.out.println(comNo);
        }

        String[] answer = {};
        return answer;
    }
}