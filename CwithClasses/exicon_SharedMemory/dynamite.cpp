#include <stdio.h>
#include <unistd.h>  

#include <stdlib.h>
#include <sys/ipc.h> 
#include <sys/shm.h> 

#include "mining_resource.h"

int main()
{
    int sharedMemoryId = shmget((key_t)sharedMemoryKey, 1024,  0666|IPC_CREAT);
	if (sharedMemoryId == -1)
	{
		perror("shmget failed : ");
		exit(1);
	}

	if ( -1 == shmctl( sharedMemoryId, IPC_RMID, 0))
	{
		printf( "Close Shared_Memory Fail\n");
		exit(1);
	}
	else
		printf( "Close Shared_Memory Success\n");
	return 0;

}

