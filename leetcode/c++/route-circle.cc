//657. Judge Route Circle (C++)
class Solution {
public:
    struct C { int x; int y; };    
    bool judgeCircle (string moves) {
        C c = {0};        
        for (int i = 0; i < moves.length(); i++) {
            if (moves[i] == 'R') c.x++;
            else if (moves[i] == 'L') c.x--;
            else if (moves[i] == 'U') c.y++;
            else c.y--;
        }        
        return c.x == 0 && c.y == 0;
    }
};