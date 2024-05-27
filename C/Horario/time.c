#include <stdio.h>
#include <time.h>
#include <stdint.h>
int main(){
    time_t result = time(NULL);
    if(result != (time_t)(-1))
    printf("Em inglês, o tempo agora e: %s\n", 
         asctime(gmtime(&result)), (intmax_t)result );
}