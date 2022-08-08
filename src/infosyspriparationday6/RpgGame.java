/*
 * RPG GAME
 While playing an RPG game, you were assigned to complete one of the hardest 
 quests in this game. There are n monsters you’ll need to defeat in this quest.
 Each monster is described with two integer numbers –poweri and bonusi. To 
 defeat this monster, you’ll need at least poweri experience points. If you 
 try fighting thismonster without having enough experience points, you lose 
 immediately. You will also gain bonusi experience points if you defeat this
 monster. You can defeat monsters in any order. The quest turned out to be
 very hard – you try to defeat the monsters but keep losing repeatedly.
 Your friend told you that this quest is impossible to complete. Knowing that,
 you9re interested, what is the maximum possible number of monsters you can 
 defeat?
 
 Input:
The first line contains an integer, n, denoting the number of monsters.
 The next line contains an integer, e,denoting your initial experience.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer,
poweri, which represents power of the corresponding monster.


Input:

The first line contains an integer, n, denoting the number of monsters. 
The next line contains an integer, e, denoting your initial experience.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer,
poweri, which represents power of the corresponding monster.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer,
bonusi, which represents bonus for defeating the corresponding monster.


Input 1:
2
123
78
130
10
0
Output 1: 
2



Input 2::
3
100
101
100
304
100
1
524
Output:: 
2

Initial experience level is 100 points.
Defeat the second monster having power of 100 and bonus of 1. Experience level is now 100+1=101.
Defeat the first monster having power of 101 and bonus of 100. Experience level is now 101+100=201.
The third monster can’t be defeated.
 */
package infosyspriparationday6;

import java.util.*;

public class RpgGame {
	static int[] m;
	static int[] p;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// no of monster
		int power = sc.nextInt();
		m = new int[n]; // array of  monster powers
		p = new int[n]; // array of  bonus points
		int count = 0;
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		// sorting function
		sort(m, p, n);
		for (int i = 0; i < n; i++) {
			if (power >= m[i]) {
				power += p[i];
				count++;
			}
		}
		System.out.println(count);
	}

	private static void sort(int[] m, int[] p, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (m[i] > m[j]) {
					m[i] = m[i] + m[j] - (m[j] = m[i]);
					p[i] = p[i] + p[j] - (p[j] = p[i]);
				}
			}
		}
	}
}
