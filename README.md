# VCANUScodingTest
5번문제 풀이입니다.

초기값을 주고 시작했습니다
int[][] pond = {
    			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
    			{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    			{0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
    			{0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
    			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
    			{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
    			{0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
    			{0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
    			{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
    			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    	};
    	
      수정값이 있는지 없는지 확인하기 위해서 배열이 바뀐게 있으면 true를 유지합니다
    	boolean count = true;
    	
      배열에 바뀐게 있으면 계속 반복합니다
    	while(count) {
    		count = false;  
    		for(int i = 0; i < pond.length; i++) {
            
            상하좌우를 표현하는데 배열의 인덱스 밖으로 나가면 안되기때문에 continue로 넘겼습니다.
        		if(i - 1 < 0 || i + 1 >= pond.length)
        			continue;
        		for(int j = 0; j < pond[i].length; j++) {
        			
              
              보내주신 result에 0은 포함시키면 안되는거같아서 0도같이 배제했습니다.
        			if(j - 1 < 0 || j + 1 >= pond[i].length || pond[i][j] == 0)
            			continue;
        			
              상하좌우가 크거나 같으면 값을 증가시키고 true를 유지합니다.
        			if(pond[i-1][j] >= pond[i][j] 
        					&& pond[i+1][j] >= pond[i][j] 
        							&& pond[i][j-1] >= pond[i][j] 
        									&& pond[i][j+1] >= pond[i][j]) {
        				pond[i][j]++;
        				count = true;
        			}
        		}
        	}
    	}
    	
    	
      답을 출력
    	for(int i = 0; i < pond.length; i++) {
    		for(int j = 0; j < pond[i].length; j++) {
    			System.out.print(" " + pond[i][j] + " ");
    		}
    		
    		System.out.println();
    	}
