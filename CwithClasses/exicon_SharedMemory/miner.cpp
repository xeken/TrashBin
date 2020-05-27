#include <stdio.h>
#include <unistd.h>
#include <cstring>
/////Shared Memory Include //
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/shm.h>
//////////////////////////////
#include "mining_resource.h"

int main(){

    int sharedMemoryId = shmget((key_t)sharedMemoryKey, 1024,  0666|IPC_CREAT);
    void *sharedMemory = shmat(sharedMemoryId, (void *)0, 0);

    if(sharedMemoryId == -1 || sharedMemory == (void *)-1){
        perror("shmget failed: ");
        exit(1);
    }
    
    SHM_T *sharedMemory_t = (SHM_T *)sharedMemory;
    SHM_T temp;
    memcpy(&temp, sharedMemory_t, sizeof(SHM_T));

    while (true){
        
        if(memcmp(&temp, sharedMemory_t, sizeof(SHM_T)) != 0);
            printf("timestamp changed to %d\n", sharedMemory_t->timestamp);
        sleep(1);
    }
}