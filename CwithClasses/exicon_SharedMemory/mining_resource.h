#ifndef __MINING_RESOURCE_H__
#define __MINING_RESOURCE_H__

#include <stdlib.h>

#define sharedMemoryKey 6666

typedef struct mine{

    time_t timestamp;
    char lotid[256];
    char test_sub[256];
    int mount[16];
    int current_test[16];
    int current_fail[16];
    char alarm[256];

} __attribute__((packed)) SHM_T;

#endif