#include <iostream>
#include <ctime>
#include <iomanip>

int main() {
    // 현재 UTC 시간 가져오기
    time_t now = time(0);
    
    // 서울 시간으로 변환 (UTC + 9시간)
    now += 9 * 3600;
    
    // UTC 기준으로 tm 구조체 변환 (이미 9시간 더했으므로)
    tm* seoul_time = gmtime(&now);
    
    // YYYY-MM-DD 형식으로 출력
    std::cout << seoul_time->tm_year + 1900 << "-"
              << std::setfill('0') << std::setw(2) << seoul_time->tm_mon + 1 << "-"
              << std::setfill('0') << std::setw(2) << seoul_time->tm_mday << std::endl;
    
    return 0;
}