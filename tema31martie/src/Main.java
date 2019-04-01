public class Main {
        public static void main(String[] args) {

            JDBCUtil.selectAllRecordFromClasses();

            JDBCUtil.selectAllDateForIdCourse(1);

            JDBCUtil.selectAllRecordFromClassesWhereTitle("INTRO");

            JDBCUtil.selectAllRecordFromClassesWhereDept("COS");

        }
    }

