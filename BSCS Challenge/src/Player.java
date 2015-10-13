import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
 
public class Player {
       
        private String name, grade;
        private int learningChip, integrityChip, craftChip, skillChip, qualityPoint;
        private Room playerLocation;
       
        public Player(String n, Room r, int lc, int ic, int cc, int sc, int qp, String g) {
                name = n;
                playerLocation = r;
                learningChip = lc;
                integrityChip = ic;
                craftChip = cc;
                skillChip = sc;
                qualityPoint = qp;
                grade = g;
               
        }
       
        public String getName() {
                return name;
        }
       
        public void setName(String n) {
                name = n;
        }
       
        public Room getPlayerLocation() {
                return playerLocation;
        }
       
        public void setPlayerLocation(Room r) {
                playerLocation = r;
        }
       
        public int getLearningChip() {
                return learningChip;
        }
       
        public void setLearningChip(int lc) {
                learningChip = lc;
        }
       
        public int getIntegrityChip() {
                return integrityChip;
        }
       
        public void setIntegrityChip(int ic) {
                integrityChip = ic;
        }
       
        public int getcraftChip() {
                return craftChip;
        }
       
        public void setCraftChip(int cc) {
                craftChip = cc;
        }
       
        public int getSkillChip() {
                return skillChip;
        }
       
        public void setSkipChip(int sc) {
                skillChip = sc;
        }
       
        public int getQualityPoint() {
                return qualityPoint;
        }
       
        public void setQualityPoint(int qp) {
                qualityPoint = qp;
        }
       
        public String getGrade() {
                return grade;
        }
       
        public void setGrade(String g) {
                grade = g;
        }
       
        public void promote(int qp) {
                if (qp < 25 && qp > 0) {
                        grade = "Freshman";
                }
                if (qp >= 25 && qp < 50) {
                        grade = "Sophmore";
                }
                if (qp >= 50 && qp < 75) {
                        grade = "Junior";
                }
                if (qp >= 75 && qp < 100) {
                        grade = "Senior";
                }
        }
       
        public void move(Graphics g) {
               
        }
       
        public void draw(Graphics g) {
               
        }
       
}