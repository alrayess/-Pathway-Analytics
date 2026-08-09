import java.util.Scanner;

/**
 * PathwayAnalytics
 * ------------------------------------------------------------
 * Beginner-friendly console advising project for the
 * University of Wisconsin-Milwaukee Computer Science, B.S.
 *
 * IMPORTANT:
 * - This program is an educational planning tool, not an official degree audit.
 * - The requirement lists are based primarily on the Fall 2025 advising sheet
 *   supplied for this project.
 * - Course prerequisites and degree requirements can change.
 * - Students should always verify final decisions with the UWM catalog and an advisor.
 *
 * File name: PathwayAnalytics.java
 * Class name: PathwayAnalytics
 */
public class PathwayAnalytics {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        printTitle();

        System.out.print("Are you studying Computer Science, Bachelor of Science at UWM? (yes/no): ");
        String answer = input.nextLine().trim();

        if (!isYes(answer)) {
            System.out.println();
            System.out.println("Thank you so much for trying PathwayAnalytics!");
            System.out.println("At this time, this program only provides pathway information for:");
            System.out.println("University of Wisconsin-Milwaukee - Computer Science, Bachelor of Science.");
            System.out.println("Please check your own program's official degree requirements with your school.");
            return;
        }

        System.out.println();
        System.out.println("Great! PathwayAnalytics will help you explore the UWM Computer Science B.S. pathway.");
        System.out.println("The degree requires a minimum of 120 total credits.");
        System.out.println("You can use the menus below to study the major requirements, mathematics,");
        System.out.println("natural sciences, technical electives, applied mathematics electives,");
        System.out.println("GER requirements, free electives, prerequisites, and possible career pathways.");

        mainMenu();

        System.out.println();
        System.out.println("Thank you for using PathwayAnalytics.");
        System.out.println("Always confirm your final schedule with the current UWM Academic Catalog and your advisor.");
    }

    // ------------------------------------------------------------
    // MAIN MENU
    // ------------------------------------------------------------
    public static void mainMenu() {
        boolean running = true;

        while (running) {
            System.out.println();
            printLine();
            System.out.println("PATHWAYANALYTICS MAIN MENU");
            printLine();
            System.out.println("1  - Degree overview");
            System.out.println("2  - Major requirements");
            System.out.println("3  - Mathematics requirement");
            System.out.println("4  - Natural science requirement");
            System.out.println("5  - Technical electives");
            System.out.println("6  - Applied mathematics electives");
            System.out.println("7  - General Education Requirements (GER)");
            System.out.println("8  - Free electives and total-credit reminder");
            System.out.println("9  - Explain C-or-higher and prerequisite rules");
            System.out.println("10 - Suggested four-year pathway");
            System.out.println("11 - Career pathway / elective recommender");
            System.out.println("12 - Required-course progress checker");
            System.out.println("13 - Prerequisite chain viewer");
            System.out.println("14 - Graduation checklist");
            System.out.println("0  - Exit");
            printLine();
            System.out.print("Choose an option: ");

            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    degreeOverview();
                    break;
                case "2":
                    majorRequirementsMenu();
                    break;
                case "3":
                    mathematicsRequirement();
                    break;
                case "4":
                    naturalScienceRequirement();
                    break;
                case "5":
                    technicalElectivesMenu();
                    break;
                case "6":
                    appliedMathElectives();
                    break;
                case "7":
                    gerRequirements();
                    break;
                case "8":
                    freeElectives();
                    break;
                case "9":
                    explainCOrHigher();
                    break;
                case "10":
                    fourYearPathway();
                    break;
                case "11":
                    careerPathwayRecommender();
                    break;
                case "12":
                    progressChecker();
                    break;
                case "13":
                    prerequisiteChainViewer();
                    break;
                case "14":
                    graduationChecklist();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("Please enter a valid menu number.");
            }
        }
    }

    // ------------------------------------------------------------
    // TITLE / HELPERS
    // ------------------------------------------------------------
    public static void printTitle() {
        System.out.println("============================================================");
        System.out.println("                 PATHWAY ANALYTICS");
        System.out.println("      UWM COMPUTER SCIENCE B.S. PLANNING ASSISTANT");
        System.out.println("============================================================");
        System.out.println("This beginner Java program helps a student understand");
        System.out.println("the Computer Science Bachelor of Science degree pathway.");
        System.out.println("============================================================");
    }

    public static void printLine() {
        System.out.println("------------------------------------------------------------");
    }

    public static boolean isYes(String text) {
        return text.equalsIgnoreCase("yes") ||
               text.equalsIgnoreCase("y") ||
               text.equalsIgnoreCase("yeah") ||
               text.equalsIgnoreCase("yep");
    }

    public static boolean askCompleted(String course) {
        System.out.print("Have you completed " + course + "? (yes/no): ");
        return isYes(input.nextLine().trim());
    }

    public static boolean askCompletedC(String course) {
        System.out.print("Have you completed " + course + " with a grade of C or better? (yes/no): ");
        return isYes(input.nextLine().trim());
    }

    public static void pause() {
        System.out.println();
        System.out.print("Press ENTER to return to the menu...");
        input.nextLine();
    }

    // ------------------------------------------------------------
    // DEGREE OVERVIEW
    // ------------------------------------------------------------
    public static void degreeOverview() {
        System.out.println();
        printLine();
        System.out.println("DEGREE OVERVIEW - COMPUTER SCIENCE, BACHELOR OF SCIENCE");
        printLine();
        System.out.println("University: University of Wisconsin-Milwaukee (UWM)");
        System.out.println("Degree: Bachelor of Science");
        System.out.println("Major: Computer Science");
        System.out.println("Minimum credits to graduate: 120 total credits");
        System.out.println();
        System.out.println("The Fall 2025 advising worksheet organizes the degree into these areas:");
        System.out.println("  1. Computer Science major requirements");
        System.out.println("  2. Mathematics requirement");
        System.out.println("  3. Natural Science requirement");
        System.out.println("  4. Technical electives");
        System.out.println("  5. Applied Mathematics electives");
        System.out.println("  6. GER / university distribution requirements");
        System.out.println("  7. Free electives, if needed to reach 120 credits");
        System.out.println();
        System.out.println("A student should not simply count credits. The student must also satisfy");
        System.out.println("course prerequisites, minimum-grade rules, sequencing, residency rules,");
        System.out.println("and any current university graduation requirements.");
        System.out.println();
        System.out.println("IMPORTANT: This project is an advising helper, not an official degree audit.");
        pause();
    }

    // ------------------------------------------------------------
    // MAJOR REQUIREMENTS
    // ------------------------------------------------------------
    public static void majorRequirementsMenu() {
        boolean viewing = true;

        while (viewing) {
            System.out.println();
            printLine();
            System.out.println("COMPUTER SCIENCE MAJOR REQUIREMENTS");
            printLine();
            System.out.println("1 - Show all required major courses");
            System.out.println("2 - Show introductory programming sequence");
            System.out.println("3 - Show systems sequence");
            System.out.println("4 - Show algorithms and theory sequence");
            System.out.println("5 - Show software/professional/capstone courses");
            System.out.println("6 - Show detailed descriptions and prerequisite notes");
            System.out.println("0 - Return to main menu");
            System.out.print("Choose an option: ");

            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    showAllMajorCourses();
                    break;
                case "2":
                    programmingSequence();
                    break;
                case "3":
                    systemsSequence();
                    break;
                case "4":
                    algorithmsSequence();
                    break;
                case "5":
                    softwareProfessionalCapstone();
                    break;
                case "6":
                    majorCourseDetails();
                    break;
                case "0":
                    viewing = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void showAllMajorCourses() {
        System.out.println();
        System.out.println("REQUIRED COMPUTER SCIENCE / ENGINEERING COURSES");
        printLine();
        System.out.println("COMPSCI 150 - Survey of Computer Science - 3 credits");
        System.out.println("COMPSCI 250 - Introductory Computer Programming - 4 credits");
        System.out.println("COMPSCI 251 - Intermediate Computer Programming - 4 credits");
        System.out.println("COMPSCI 317 - Discrete Information Structures - 4 credits");
        System.out.println("COMPSCI 337 - System Programming - 3 credits");
        System.out.println("COMPSCI 351 - Data Structures and Algorithms - 4 credits");
        System.out.println("COMPSCI 361 - Introduction to Software Engineering - 3 credits");
        System.out.println("COMPSCI 395 - Social, Professional, and Ethical Issues - 3 credits");
        System.out.println("COMPSCI 431 - Programming Languages Concepts - 3 credits");
        System.out.println("COMPSCI 458 - Computer Architecture - 3 credits");
        System.out.println("COMPSCI 535 - Algorithm Design and Analysis - 3 credits");
        System.out.println("COMPSCI 537 - Introduction to Operating Systems - 3 credits");
        System.out.println("COMPSCI 594 - Capstone Project Preparation - 1 credit");
        System.out.println("COMPSCI 595 - Capstone Project - 3 credits");
        System.out.println("EAS 200 - Professional Seminar - 1 credit");
        System.out.println();
        System.out.println("The advising sheet marks several early major courses with a");
        System.out.println("'C or higher required' rule. A low passing grade may therefore");
        System.out.println("not be enough to continue into later courses that depend on them.");
        pause();
    }

    public static void programmingSequence() {
        System.out.println();
        System.out.println("INTRODUCTORY PROGRAMMING SEQUENCE");
        printLine();
        System.out.println("Step 1: COMPSCI 150 - Survey of Computer Science");
        System.out.println("  Introductory exposure to computer science as a field.");
        System.out.println();
        System.out.println("Step 2: COMPSCI 250 - Introductory Computer Programming");
        System.out.println("  Beginner programming, problem solving, control structures,");
        System.out.println("  functions/methods, arrays, and object-oriented ideas.");
        System.out.println("  Current catalog prerequisite note: Math Placement Level 30.");
        System.out.println();
        System.out.println("Step 3: COMPSCI 251 - Intermediate Computer Programming");
        System.out.println("  Builds stronger object-oriented programming and data-structure skills.");
        System.out.println("  A grade of C or better in COMPSCI 250 is required for the sequence.");
        System.out.println();
        System.out.println("Step 4: COMPSCI 351 - Data Structures and Algorithms");
        System.out.println("  Introduces important structures and algorithmic problem solving.");
        System.out.println("  A grade of C or better in COMPSCI 251 is required.");
        System.out.println();
        System.out.println("These courses form one of the most important prerequisite chains in the degree.");
        pause();
    }

    public static void systemsSequence() {
        System.out.println();
        System.out.println("SYSTEMS PATHWAY INSIDE THE REQUIRED MAJOR");
        printLine();
        System.out.println("COMPSCI 351 - Data Structures and Algorithms");
        System.out.println("        |");
        System.out.println("        v");
        System.out.println("COMPSCI 337 - System Programming");
        System.out.println("        |");
        System.out.println("        v");
        System.out.println("COMPSCI 458 - Computer Architecture");
        System.out.println("        |");
        System.out.println("        v");
        System.out.println("COMPSCI 537 - Introduction to Operating Systems");
        System.out.println();
        System.out.println("Important minimum-grade notes from current catalog information:");
        System.out.println("- COMPSCI 337 requires C or better in COMPSCI 351.");
        System.out.println("- COMPSCI 458 requires C or better in COMPSCI 351 and C or better");
        System.out.println("  in COMPSCI 337 (or the allowed electrical engineering alternative).");
        System.out.println("- COMPSCI 537 requires COMPSCI 337 and requires COMPSCI 458");
        System.out.println("  to be completed or taken concurrently, depending on the catalog notation.");
        System.out.println();
        System.out.println("Because of this chain, delaying an early systems prerequisite can delay later courses.");
        pause();
    }

    public static void algorithmsSequence() {
        System.out.println();
        System.out.println("ALGORITHMS / THEORY PATHWAY INSIDE THE REQUIRED MAJOR");
        printLine();
        System.out.println("COMPSCI 317 - Discrete Information Structures");
        System.out.println("  Provides discrete structures and mathematical thinking used in CS.");
        System.out.println();
        System.out.println("COMPSCI 351 - Data Structures and Algorithms");
        System.out.println("  Develops data-structure implementation and algorithmic problem solving.");
        System.out.println();
        System.out.println("COMPSCI 535 - Algorithm Design and Analysis");
        System.out.println("  Advanced algorithm design and analysis.");
        System.out.println("  Current catalog information includes junior standing, a calculus course,");
        System.out.println("  C or better in COMPSCI 351, and discrete-mathematics preparation.");
        System.out.println();
        System.out.println("This sequence is especially important for technical interviews,");
        System.out.println("advanced software engineering, AI, theory, and graduate study.");
        pause();
    }

    public static void softwareProfessionalCapstone() {
        System.out.println();
        System.out.println("SOFTWARE, PROFESSIONAL, ETHICS, AND CAPSTONE COURSES");
        printLine();
        System.out.println("COMPSCI 361 - Introduction to Software Engineering - 3 credits");
        System.out.println("  Focuses on software development practices beyond writing isolated code.");
        System.out.println();
        System.out.println("COMPSCI 395 - Social, Professional, and Ethical Issues - 3 credits");
        System.out.println("  Examines ethical and professional responsibilities in computing.");
        System.out.println();
        System.out.println("COMPSCI 431 - Programming Languages Concepts - 3 credits");
        System.out.println("  Studies important ideas behind programming languages.");
        System.out.println();
        System.out.println("EAS 200 - Professional Seminar - 1 credit");
        System.out.println("  Professional development course in the engineering school.");
        System.out.println();
        System.out.println("COMPSCI 594 - Capstone Project Preparation - 1 credit");
        System.out.println("  Helps prepare for the final capstone project.");
        System.out.println();
        System.out.println("COMPSCI 595 - Capstone Project - 3 credits");
        System.out.println("  Senior capstone project where students integrate their CS knowledge.");
        pause();
    }

    public static void majorCourseDetails() {
        System.out.println();
        System.out.println("DETAILED REQUIRED-COURSE NOTES");
        printLine();

        System.out.println("COMPSCI 150 - Survey of Computer Science");
        System.out.println("  Credits: 3");
        System.out.println("  Role: Broad introduction to the discipline of computer science.");
        System.out.println();

        System.out.println("COMPSCI 250 - Introductory Computer Programming");
        System.out.println("  Credits: 4");
        System.out.println("  Role: First major programming course.");
        System.out.println("  Current prerequisite note: Math Placement Level 30.");
        System.out.println("  Grade note: The pathway expects C or better before moving to COMPSCI 251.");
        System.out.println();

        System.out.println("COMPSCI 251 - Intermediate Computer Programming");
        System.out.println("  Credits: 4");
        System.out.println("  Role: Object-oriented programming, classes, standard data structures,");
        System.out.println("        debugging, text-analysis tools, and software development skills.");
        System.out.println("  Prerequisite note: C or better in COMPSCI 250 plus required math readiness.");
        System.out.println();

        System.out.println("COMPSCI 317 - Discrete Information Structures");
        System.out.println("  Credits: 4");
        System.out.println("  Role: Discrete structures and mathematical foundations for computer science.");
        System.out.println("  Grade note: The advising worksheet marks this course as C-or-higher important.");
        System.out.println();

        System.out.println("COMPSCI 337 - System Programming");
        System.out.println("  Credits: 3");
        System.out.println("  Role: Operating-system interfaces, memory, computer organization,");
        System.out.println("        and lower-level/system programming.");
        System.out.println("  Prerequisite note: C or better in COMPSCI 351.");
        System.out.println();

        System.out.println("COMPSCI 351 - Data Structures and Algorithms");
        System.out.println("  Credits: 4");
        System.out.println("  Role: Implementing data structures and algorithms in an object-oriented language.");
        System.out.println("  Prerequisite note: C or better in COMPSCI 251 plus required math readiness.");
        System.out.println();

        System.out.println("COMPSCI 361 - Introduction to Software Engineering");
        System.out.println("  Credits: 3");
        System.out.println("  Role: Team-oriented software development and software engineering ideas.");
        System.out.println();

        System.out.println("COMPSCI 395 - Social, Professional, and Ethical Issues");
        System.out.println("  Credits: 3");
        System.out.println("  Role: Professional responsibilities and ethical issues in computing.");
        System.out.println();

        System.out.println("COMPSCI 431 - Programming Languages Concepts");
        System.out.println("  Credits: 3");
        System.out.println("  Role: Concepts and design ideas used across programming languages.");
        System.out.println();

        System.out.println("COMPSCI 458 - Computer Architecture");
        System.out.println("  Credits: 3");
        System.out.println("  Role: Processor organization, memory hierarchy, parallelism, and architecture.");
        System.out.println("  Prerequisite note: C or better in COMPSCI 351 and C or better in");
        System.out.println("        COMPSCI 337 or an approved electrical engineering alternative.");
        System.out.println();

        System.out.println("COMPSCI 535 - Algorithm Design and Analysis");
        System.out.println("  Credits: 3");
        System.out.println("  Role: More advanced study of algorithm design and efficiency analysis.");
        System.out.println("  Prerequisite note: Includes C or better in COMPSCI 351 and additional");
        System.out.println("        mathematics/discrete-structure preparation.");
        System.out.println();

        System.out.println("COMPSCI 537 - Introduction to Operating Systems");
        System.out.println("  Credits: 3");
        System.out.println("  Role: Processes, threads, scheduling, concurrency, memory, and systems programming.");
        System.out.println("  Prerequisite note: Requires COMPSCI 337 and architecture preparation.");
        System.out.println();

        System.out.println("COMPSCI 594 - Capstone Project Preparation");
        System.out.println("  Credits: 1");
        System.out.println("  Role: Preparation for the senior capstone project.");
        System.out.println();

        System.out.println("COMPSCI 595 - Capstone Project");
        System.out.println("  Credits: 3");
        System.out.println("  Role: Final integrative project experience.");
        System.out.println();

        System.out.println("EAS 200 - Professional Seminar");
        System.out.println("  Credits: 1");
        System.out.println("  Role: Professional development within the engineering school.");

        pause();
    }

    // ------------------------------------------------------------
    // MATHEMATICS REQUIREMENT
    // ------------------------------------------------------------
    public static void mathematicsRequirement() {
        System.out.println();
        printLine();
        System.out.println("MATHEMATICS REQUIREMENT");
        printLine();
        System.out.println("The Fall 2025 advising sheet shows a 4-credit mathematics requirement.");
        System.out.println("Select ONE approved calculus option:");
        System.out.println();
        System.out.println("MATH 211 - Survey in Calculus and Analytic Geometry I");
        System.out.println("MATH 213 - Calculus with Life Sciences Applications");
        System.out.println("MATH 221 - Honors Calculus I");
        System.out.println("MATH 231 - Calculus and Analytic Geometry I");
        System.out.println();
        System.out.println("Why this matters:");
        System.out.println("- Calculus is part of the mathematical foundation of the B.S. degree.");
        System.out.println("- Some later CS technical courses may require one of these calculus courses.");
        System.out.println("- Your exact math route should match placement, transfer credit, and advisor guidance.");
        System.out.println();
        System.out.println("Do not confuse this 4-credit mathematics requirement with the separate");
        System.out.println("Applied Mathematics Electives requirement described elsewhere in this program.");
        pause();
    }

    // ------------------------------------------------------------
    // NATURAL SCIENCE
    // ------------------------------------------------------------
    public static void naturalScienceRequirement() {
        boolean viewing = true;

        while (viewing) {
            System.out.println();
            printLine();
            System.out.println("NATURAL SCIENCE REQUIREMENT");
            printLine();
            System.out.println("Requirement from the advising sheet:");
            System.out.println("Complete 6 approved natural-science credits, including at least 1 laboratory credit.");
            System.out.println();
            System.out.println("1 - Show approved courses WITH laboratory designation");
            System.out.println("2 - Show approved courses WITHOUT laboratory designation");
            System.out.println("3 - Explain how to build a 6-credit science plan");
            System.out.println("0 - Return to main menu");
            System.out.print("Choose an option: ");

            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    naturalScienceWithLab();
                    break;
                case "2":
                    naturalScienceWithoutLab();
                    break;
                case "3":
                    sciencePlanningGuide();
                    break;
                case "0":
                    viewing = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void naturalScienceWithLab() {
        System.out.println();
        System.out.println("APPROVED NATURAL SCIENCE COURSES WITH LABORATORY (NS+)");
        printLine();
        System.out.println("ASTRON 104 - Astronomy Laboratory");
        System.out.println("BIO SCI 150 - Foundations of Biological Sciences I");
        System.out.println("BIO SCI 152 - Foundations of Biological Sciences II");
        System.out.println("BIO SCI 201 - Human Structure and Function");
        System.out.println("BIO SCI 203 - Anatomy and Physiology II");
        System.out.println("CHEM 102 - General Chemistry");
        System.out.println("CHEM 104 - General Chemistry and Qualitative Analysis");
        System.out.println("CHEM 105 - General Chemistry for Engineering");
        System.out.println("GEO SCI 100 - Introduction to the Earth");
        System.out.println("GEO SCI 102 - Evolution of the Earth");
        System.out.println("GEO SCI 120 - Geology of the Planets");
        System.out.println("GEO SCI 151 - Ocean Sciences Laboratory");
        System.out.println("GEO SCI 130 - Our Physical Environment");
        System.out.println("PHYSICS 121 - General Physics Laboratory I (Non-Calculus Treatment)");
        System.out.println("PHYSICS 123 - General Physics Laboratory II (Non-Calculus Treatment)");
        System.out.println("PHYSICS 214 - Lab Physics I (Calculus Treatment)");
        System.out.println("PHYSICS 215 - Lab Physics II (Calculus Treatment)");
        System.out.println("PHYSICS 219 - Physics I: Calculus-Based, Studio Format");
        System.out.println("PHYSICS 220 - Physics II: Calculus-Based, Studio Format");
        System.out.println();
        System.out.println("Choose courses carefully: some science courses have their own prerequisites.");
        pause();
    }

    public static void naturalScienceWithoutLab() {
        System.out.println();
        System.out.println("APPROVED NATURAL SCIENCE COURSES WITHOUT LABORATORY (NS)");
        printLine();
        System.out.println("ASTRON 103 - Survey of Astronomy");
        System.out.println("ATM SCI 194 - First-Year Seminar");
        System.out.println("ATM SCI 297 - Study Abroad");
        System.out.println("ATM SCI 381 - Honors Seminar");
        System.out.println("ATM SCI 497 - Study Abroad");
        System.out.println("BIO SCI 194 - First-Year Seminar");
        System.out.println("BIO SCI 206 - Biology of Women");
        System.out.println("BIO SCI 380 - Honors Seminar");
        System.out.println("CES 210 - Introduction to Conservation and Environmental Science");
        System.out.println("CHEM 100 - Chemical Science");
        System.out.println("GEOG 125 - Introduction to Environmental Geography");
        System.out.println("GEO SCI 150 - Introduction to Ocean Sciences");
        System.out.println("GEO SCI 194 - First-Year Seminar");
        System.out.println("GEO SCI 381 - Honors Seminar");
        System.out.println("PHYSICS 120 - General Physics I (Non-Calculus Treatment)");
        System.out.println("PHYSICS 122 - General Physics II (Non-Calculus Treatment)");
        System.out.println("PHYSICS 209 - Physics I (Calculus Treatment)");
        System.out.println("PHYSICS 210 - Physics II (Calculus Treatment)");
        System.out.println();
        System.out.println("Remember: taking only non-lab courses does NOT satisfy the major's laboratory requirement.");
        pause();
    }

    public static void sciencePlanningGuide() {
        System.out.println();
        System.out.println("HOW TO BUILD A NATURAL-SCIENCE PLAN");
        printLine();
        System.out.println("1. You need 6 approved natural-science credits total.");
        System.out.println("2. At least 1 credit must be a laboratory credit from the approved list.");
        System.out.println("3. You can combine approved science courses as long as the total and lab rule are satisfied.");
        System.out.println("4. Confirm whether a selected lecture requires a separate lab or whether the course is studio/lab integrated.");
        System.out.println("5. Check prerequisites before registering.");
        System.out.println("6. Natural science courses may also overlap with university GER science requirements when allowed.");
        System.out.println();
        System.out.println("Example idea only: a student could select an approved science lecture plus an approved lab");
        System.out.println("and another approved science course until the student reaches at least 6 approved credits.");
        pause();
    }

    // ------------------------------------------------------------
    // TECHNICAL ELECTIVES
    // ------------------------------------------------------------
    public static void technicalElectivesMenu() {
        boolean viewing = true;

        while (viewing) {
            System.out.println();
            printLine();
            System.out.println("TECHNICAL ELECTIVES - FALL 2025 WORKSHEET");
            printLine();
            System.out.println("The supplied advising sheet says: Select 9 credits from the approved list.");
            System.out.println("It also says non-required COMPSCI courses numbered 400-699 are Technical Electives.");
            System.out.println();
            System.out.println("1 - Show Computer Science technical electives");
            System.out.println("2 - Show Electrical Engineering technical electives");
            System.out.println("3 - Show every technical elective together");
            System.out.println("4 - Get pathway recommendations");
            System.out.println("0 - Return to main menu");
            System.out.print("Choose an option: ");

            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    csTechnicalElectives();
                    break;
                case "2":
                    eeTechnicalElectives();
                    break;
                case "3":
                    csTechnicalElectives();
                    eeTechnicalElectives();
                    break;
                case "4":
                    careerPathwayRecommender();
                    break;
                case "0":
                    viewing = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void csTechnicalElectives() {
        System.out.println();
        System.out.println("COMPUTER SCIENCE TECHNICAL ELECTIVES");
        printLine();
        System.out.println("COMPSCI 315 - Introduction to Computer Organization and Assembly Language Programming");
        System.out.println("COMPSCI 411 - Introduction to the Theory of Computation");
        System.out.println("COMPSCI 422 - Introduction to Artificial Intelligence");
        System.out.println("COMPSCI 423 - Introduction to Natural Language Processing");
        System.out.println("COMPSCI 425 - Introduction to Data Mining");
        System.out.println("COMPSCI 443 - Intelligent User Interfaces and Usability Assessment");
        System.out.println("COMPSCI 444 - Introduction to Text Retrieval and Its Applications in Biomedicine");
        System.out.println("COMPSCI 459 - Fundamentals of Computer Graphics");
        System.out.println("COMPSCI 469 - Introduction to Computer Security");
        System.out.println("COMPSCI 481 - Server-side Internet Programming");
        System.out.println("COMPSCI 482 - Rich Internet Applications");
        System.out.println("COMPSCI 511 - Symbolic Logic");
        System.out.println("COMPSCI 520 - Computer Networks");
        System.out.println("COMPSCI 530 - Computer Networks Laboratory");
        System.out.println("COMPSCI 536 - Software Engineering");
        System.out.println("COMPSCI 552 - Advanced Object-Oriented Programming");
        System.out.println("COMPSCI 557 - Introduction to Database Systems");
        System.out.println("COMPSCI 581 - Web Languages and Standards");
        System.out.println("COMPSCI 599 - Senior Thesis");
        System.out.println("COMPSCI 654 - Introduction to Compilers");
        System.out.println("COMPSCI 655 - Compiler Implementation Laboratory");
        System.out.println("COMPSCI 657 - Topics in Computer Science");
        System.out.println("COMPSCI 658 - Topics in Applied Computing");
        System.out.println("COMPSCI 699 - Independent Study");
        System.out.println();
        System.out.println("Reminder: prerequisites differ by elective. Check each course before registering.");
        pause();
    }

    public static void eeTechnicalElectives() {
        System.out.println();
        System.out.println("ELECTRICAL ENGINEERING TECHNICAL ELECTIVES");
        printLine();
        System.out.println("ELECENG 301 - Electrical Circuits and Electronics I");
        System.out.println("ELECENG 305 - Electrical Circuits II");
        System.out.println("ELECENG 310 - Signals and Systems");
        System.out.println("ELECENG 330 - Electrical Circuits and Electronics II");
        System.out.println("ELECENG 340 - Embedded Systems I: C and C++ Programming for Embedded Applications");
        System.out.println("ELECENG 354 - Digital Logic");
        System.out.println("ELECENG 367 - Introduction to Microprocessors");
        System.out.println("ELECENG 440 - Embedded Systems II: Advanced Embedded Systems");
        System.out.println("ELECENG 451 - Introduction to VLSI Design");
        System.out.println("ELECENG 457 - Digital Logic Laboratory");
        System.out.println();
        System.out.println("Electrical engineering electives can be useful for students interested in");
        System.out.println("embedded systems, computer hardware, robotics, low-level systems, and IoT.");
        pause();
    }

    // ------------------------------------------------------------
    // APPLIED MATHEMATICS ELECTIVES
    // ------------------------------------------------------------
    public static void appliedMathElectives() {
        System.out.println();
        printLine();
        System.out.println("APPLIED MATHEMATICS ELECTIVES - SELECT 9 CREDITS");
        printLine();
        System.out.println("IND ENG 367 - Introductory Statistics for Physical Sciences and Engineering Students");
        System.out.println("MATH 205 - Introductory Finite Mathematics");
        System.out.println("MATH 212 - Survey in Calculus and Analytic Geometry II");
        System.out.println("MATH 222 - Honors Calculus II");
        System.out.println("MATH 232 - Calculus and Analytic Geometry II");
        System.out.println("MATH 233 - Calculus and Analytic Geometry III");
        System.out.println("MATH 234 - Linear Algebra and Differential Equations");
        System.out.println("ELECENG 234 - Analytical Methods in Engineering");
        System.out.println("MATH 240 - Matrices and Applications");
        System.out.println("MATH 305 - Introduction to Mathematical and Computational Modeling");
        System.out.println("MATH 313 - Linear Programming and Optimization");
        System.out.println("MATH 315 - Mathematical Programming and Optimization");
        System.out.println("MATH 320 - Introduction to Differential Equations");
        System.out.println("MATH 341 - Seminar: Introduction to the Language and Practice of Mathematics");
        System.out.println("MATH 405 - Mathematical Models and Applications");
        System.out.println("MATH 431 - Modern Algebra with Applications");
        System.out.println("MATH 451 - Axiomatic Geometry");
        System.out.println("MTHSTAT 215 - Elementary Statistical Analysis");
        System.out.println("MTHSTAT 361 - Introduction to Mathematical Statistics I");
        System.out.println("MTHSTAT 563 - Regression Analysis");
        System.out.println();
        System.out.println("VERY IMPORTANT FOOTNOTES FROM THE FALL 2025 SHEET:");
        System.out.println("1. A student cannot use more than one of IND ENG 367 and MTHSTAT 215.");
        System.out.println("2. The 9 credits must include exactly ONE of:");
        System.out.println("      MATH 240, MATH 234, or ELECENG 234.");
        System.out.println("3. The plan may include only ONE of:");
        System.out.println("      MATH 320, MATH 234, or ELECENG 234.");
        System.out.println();
        System.out.println("Because these rules overlap, choose applied-math electives as a group rather than independently.");
        System.out.println("Always test your three-course combination against all footnotes.");
        pause();
    }

    // ------------------------------------------------------------
    // GER
    // ------------------------------------------------------------
    public static void gerRequirements() {
        System.out.println();
        printLine();
        System.out.println("GENERAL EDUCATION REQUIREMENTS (GER)");
        printLine();
        System.out.println("The personalized Fall 2025 worksheet shows GER/distribution items and may have");
        System.out.println("some requirements crossed out because they were already satisfied for that student.");
        System.out.println();
        System.out.println("Current UWM GERs are university-wide and should always be checked in the current catalog.");
        System.out.println("They include broad areas such as:");
        System.out.println("- Communication and literacy");
        System.out.println("- Humanities and arts");
        System.out.println("- Social and behavioral sciences");
        System.out.println("- Mathematics / quantitative reasoning");
        System.out.println("- Natural science / wellness with applicable laboratory rules");
        System.out.println("- Civics / perspectives under the current GER framework");
        System.out.println();
        System.out.println("The supplied worksheet also lists:");
        System.out.println("- ENGLISH 310 - Writing, Speaking, and Technoscience in the 21st Century");
        System.out.println("- Cultural Diversity requirement");
        System.out.println("- Oral and Written Communication requirement");
        System.out.println("- Foreign Language requirement");
        System.out.println();
        System.out.println("Some of these may already be satisfied through transfer work, placement,");
        System.out.println("previous degrees, or other courses, so the student's official degree audit controls.");
        pause();
    }

    // ------------------------------------------------------------
    // FREE ELECTIVES
    // ------------------------------------------------------------
    public static void freeElectives() {
        System.out.println();
        printLine();
        System.out.println("FREE ELECTIVES AND THE 120-CREDIT TOTAL");
        printLine();
        System.out.println("The B.S. degree requires at least 120 total credits.");
        System.out.println("After all major, math, science, GER, technical-elective, and applied-math");
        System.out.println("requirements are satisfied, a student may still need free-elective credits");
        System.out.println("to reach the graduation total.");
        System.out.println();
        System.out.println("Free electives can be a strategic opportunity. Examples include:");
        System.out.println("- Additional computer science courses");
        System.out.println("- Economics or business courses");
        System.out.println("- Mathematics or statistics");
        System.out.println("- Entrepreneurship");
        System.out.println("- Communication or technical writing");
        System.out.println("- Research or independent study when approved");
        System.out.println("- Courses for a minor or second field of interest");
        System.out.println();
        System.out.println("However, not every course necessarily applies exactly the way a student expects.");
        System.out.println("Use the official UWM degree audit before assuming a free elective fills a remaining slot.");
        pause();
    }

    // ------------------------------------------------------------
    // C OR HIGHER EXPLANATION
    // ------------------------------------------------------------
    public static void explainCOrHigher() {
        System.out.println();
        printLine();
        System.out.println("WHAT DOES 'C OR HIGHER REQUIRED' MEAN?");
        printLine();
        System.out.println("A prerequisite is a course or condition that must be satisfied before");
        System.out.println("you are allowed to move into another course.");
        System.out.println();
        System.out.println("If a prerequisite says 'a grade of C or better,' then merely passing");
        System.out.println("the earlier course with a lower grade may not satisfy the prerequisite.");
        System.out.println();
        System.out.println("Important examples in the CS pathway include:");
        System.out.println("- COMPSCI 251 depends on C or better in COMPSCI 250.");
        System.out.println("- COMPSCI 351 depends on C or better in COMPSCI 251.");
        System.out.println("- COMPSCI 337 depends on C or better in COMPSCI 351.");
        System.out.println("- COMPSCI 458 depends on important earlier systems/programming courses.");
        System.out.println("- COMPSCI 535 depends on C or better in COMPSCI 351 plus math/discrete preparation.");
        System.out.println();
        System.out.println("Why this matters:");
        System.out.println("If a student gets below the required minimum in an early prerequisite,");
        System.out.println("the student may need to repeat that course before continuing the chain.");
        System.out.println("That can affect scheduling because not every advanced course is offered every term.");
        System.out.println();
        System.out.println("Catalog notation reminder:");
        System.out.println("- (P) normally indicates a prerequisite that should be completed previously.");
        System.out.println("- (C) can indicate a course that may be taken concurrently.");
        System.out.println("Always read the current catalog entry for the exact rule.");
        pause();
    }

    // ------------------------------------------------------------
    // FOUR-YEAR PATHWAY
    // ------------------------------------------------------------
    public static void fourYearPathway() {
        System.out.println();
        printLine();
        System.out.println("SUGGESTED FOUR-YEAR COMPUTER SCIENCE B.S. PATHWAY");
        printLine();
        System.out.println("This is a planning example, NOT a guaranteed official schedule.");
        System.out.println("Transfer credit, placement, course availability, failed/repeated courses,");
        System.out.println("and changes to the catalog can change the best sequence.");
        System.out.println();

        System.out.println("YEAR 1 - BUILD THE FOUNDATION");
        System.out.println("Semester 1 ideas:");
        System.out.println("  - COMPSCI 150 - Survey of Computer Science");
        System.out.println("  - First approved writing/communication requirement");
        System.out.println("  - GER courses");
        System.out.println("  - Math preparation based on placement");
        System.out.println("  - Natural science or another degree requirement if appropriate");
        System.out.println();
        System.out.println("Semester 2 ideas:");
        System.out.println("  - COMPSCI 250 - Introductory Computer Programming");
        System.out.println("  - MATH 211, 213, 221, or 231 for the 4-credit math requirement");
        System.out.println("  - GER courses");
        System.out.println("  - Natural science / laboratory planning");
        System.out.println();

        System.out.println("YEAR 2 - CORE PROGRAMMING + DISCRETE + DATA STRUCTURES");
        System.out.println("Semester 1 ideas:");
        System.out.println("  - COMPSCI 251 - Intermediate Computer Programming");
        System.out.println("  - COMPSCI 317 - Discrete Information Structures");
        System.out.println("  - Communication / GER course");
        System.out.println("  - Applied mathematics elective if prerequisites allow");
        System.out.println();
        System.out.println("Semester 2 ideas:");
        System.out.println("  - COMPSCI 351 - Data Structures and Algorithms");
        System.out.println("  - COMPSCI 395 - Social, Professional, and Ethical Issues");
        System.out.println("  - EAS 200 - Professional Seminar");
        System.out.println("  - Applied mathematics elective");
        System.out.println("  - GER or natural science requirement");
        System.out.println();

        System.out.println("YEAR 3 - SYSTEMS + SOFTWARE + ARCHITECTURE + ELECTIVES");
        System.out.println("Semester 1 ideas:");
        System.out.println("  - COMPSCI 337 - System Programming");
        System.out.println("  - Technical elective #1");
        System.out.println("  - Applied mathematics elective");
        System.out.println("  - Remaining science / GER requirements");
        System.out.println();
        System.out.println("Semester 2 ideas:");
        System.out.println("  - COMPSCI 361 - Introduction to Software Engineering");
        System.out.println("  - COMPSCI 431 - Programming Languages Concepts");
        System.out.println("  - COMPSCI 458 - Computer Architecture");
        System.out.println("  - Technical elective #2 or remaining GER/free elective");
        System.out.println();

        System.out.println("YEAR 4 - ADVANCED CORE + CAPSTONE + SPECIALIZATION");
        System.out.println("Semester 1 ideas:");
        System.out.println("  - COMPSCI 535 - Algorithm Design and Analysis");
        System.out.println("  - COMPSCI 537 - Introduction to Operating Systems");
        System.out.println("  - COMPSCI 594 - Capstone Project Preparation");
        System.out.println("  - Technical elective #3");
        System.out.println("  - Remaining applied math / free elective as needed");
        System.out.println();
        System.out.println("Semester 2 ideas:");
        System.out.println("  - COMPSCI 595 - Capstone Project");
        System.out.println("  - Remaining technical electives or approved requirements");
        System.out.println("  - Remaining free electives needed to reach 120 credits");
        System.out.println("  - Final graduation audit and application for graduation");
        System.out.println();

        System.out.println("PATHWAY WARNING:");
        System.out.println("Protect the sequence COMPSCI 250 -> 251 -> 351 -> 337 -> 458 -> 537.");
        System.out.println("A delay in that chain can delay upper-level systems courses.");
        pause();
    }

    // ------------------------------------------------------------
    // CAREER PATHWAY RECOMMENDER
    // ------------------------------------------------------------
    public static void careerPathwayRecommender() {
        System.out.println();
        printLine();
        System.out.println("CAREER PATHWAY / ELECTIVE RECOMMENDER");
        printLine();
        System.out.println("Choose the area that interests you most:");
        System.out.println("1 - Artificial Intelligence / Machine Learning / Data");
        System.out.println("2 - Cybersecurity / Systems / Networks");
        System.out.println("3 - Software Engineering / Web / Databases");
        System.out.println("4 - Graphics / Games / User Interfaces");
        System.out.println("5 - Embedded Systems / Hardware / Robotics");
        System.out.println("6 - Theory / Compilers / Graduate School / Research");
        System.out.println("7 - I am unsure; show balanced options");
        System.out.print("Choose a pathway: ");

        String choice = input.nextLine().trim();

        System.out.println();

        switch (choice) {
            case "1":
                System.out.println("AI / MACHINE LEARNING / DATA PATHWAY");
                printLine();
                System.out.println("Consider technical electives such as:");
                System.out.println("- COMPSCI 422 - Introduction to Artificial Intelligence");
                System.out.println("- COMPSCI 423 - Introduction to Natural Language Processing");
                System.out.println("- COMPSCI 425 - Introduction to Data Mining");
                System.out.println("- COMPSCI 443 - Intelligent User Interfaces and Usability Assessment");
                System.out.println("- COMPSCI 444 - Text Retrieval and Applications in Biomedicine");
                System.out.println("- COMPSCI 557 - Introduction to Database Systems");
                System.out.println();
                System.out.println("Helpful applied-math directions:");
                System.out.println("- MATH 240 - Matrices and Applications");
                System.out.println("- MTHSTAT 361 - Introduction to Mathematical Statistics I");
                System.out.println("- MTHSTAT 563 - Regression Analysis");
                System.out.println("- Optimization/modeling courses when prerequisites fit");
                break;

            case "2":
                System.out.println("CYBERSECURITY / SYSTEMS / NETWORKS PATHWAY");
                printLine();
                System.out.println("Consider technical electives such as:");
                System.out.println("- COMPSCI 469 - Introduction to Computer Security");
                System.out.println("- COMPSCI 520 - Computer Networks");
                System.out.println("- COMPSCI 530 - Computer Networks Laboratory");
                System.out.println("- COMPSCI 315 - Computer Organization and Assembly Language Programming");
                System.out.println("- ELECENG 367 - Introduction to Microprocessors");
                System.out.println();
                System.out.println("The required COMPSCI 337, 458, and 537 courses are especially important here.");
                break;

            case "3":
                System.out.println("SOFTWARE ENGINEERING / WEB / DATABASE PATHWAY");
                printLine();
                System.out.println("Consider technical electives such as:");
                System.out.println("- COMPSCI 536 - Software Engineering");
                System.out.println("- COMPSCI 552 - Advanced Object-Oriented Programming");
                System.out.println("- COMPSCI 557 - Introduction to Database Systems");
                System.out.println("- COMPSCI 481 - Server-side Internet Programming");
                System.out.println("- COMPSCI 482 - Rich Internet Applications");
                System.out.println("- COMPSCI 581 - Web Languages and Standards");
                System.out.println();
                System.out.println("Also build personal projects, use Git/GitHub, practice testing,");
                System.out.println("and learn how software teams design and maintain larger applications.");
                break;

            case "4":
                System.out.println("GRAPHICS / GAMES / USER INTERFACES PATHWAY");
                printLine();
                System.out.println("Consider technical electives such as:");
                System.out.println("- COMPSCI 459 - Fundamentals of Computer Graphics");
                System.out.println("- COMPSCI 443 - Intelligent User Interfaces and Usability Assessment");
                System.out.println("- COMPSCI 482 - Rich Internet Applications");
                System.out.println();
                System.out.println("Helpful math can include matrices, linear algebra, and calculus.");
                break;

            case "5":
                System.out.println("EMBEDDED SYSTEMS / HARDWARE / ROBOTICS PATHWAY");
                printLine();
                System.out.println("Consider technical electives such as:");
                System.out.println("- COMPSCI 315 - Computer Organization and Assembly Language Programming");
                System.out.println("- ELECENG 340 - Embedded Systems I");
                System.out.println("- ELECENG 354 - Digital Logic");
                System.out.println("- ELECENG 367 - Introduction to Microprocessors");
                System.out.println("- ELECENG 440 - Embedded Systems II");
                System.out.println("- ELECENG 451 - Introduction to VLSI Design");
                System.out.println("- ELECENG 457 - Digital Logic Laboratory");
                System.out.println();
                System.out.println("This route is useful for students interested in computers that interact with physical devices.");
                break;

            case "6":
                System.out.println("THEORY / COMPILERS / RESEARCH PATHWAY");
                printLine();
                System.out.println("Consider technical electives such as:");
                System.out.println("- COMPSCI 411 - Introduction to the Theory of Computation");
                System.out.println("- COMPSCI 511 - Symbolic Logic");
                System.out.println("- COMPSCI 654 - Introduction to Compilers");
                System.out.println("- COMPSCI 655 - Compiler Implementation Laboratory");
                System.out.println("- COMPSCI 599 - Senior Thesis");
                System.out.println("- COMPSCI 699 - Independent Study");
                System.out.println();
                System.out.println("Helpful math can include modern algebra, mathematical statistics,");
                System.out.println("optimization, and other proof-oriented courses depending on your goal.");
                break;

            case "7":
                System.out.println("BALANCED PATHWAY");
                printLine();
                System.out.println("If you are unsure, choose electives that expose you to different areas.");
                System.out.println("Example balanced set from the Fall 2025 list:");
                System.out.println("- COMPSCI 422 - Artificial Intelligence");
                System.out.println("- COMPSCI 469 - Computer Security");
                System.out.println("- COMPSCI 557 - Database Systems");
                System.out.println();
                System.out.println("That combination exposes you to AI, security/systems, and data/software.");
                System.out.println("Check prerequisites and current technical-elective rules before enrolling.");
                break;

            default:
                System.out.println("Invalid pathway choice.");
        }

        pause();
    }

    // ------------------------------------------------------------
    // PROGRESS CHECKER
    // ------------------------------------------------------------
    public static void progressChecker() {
        System.out.println();
        printLine();
        System.out.println("REQUIRED-COURSE PROGRESS CHECKER");
        printLine();
        System.out.println("Answer yes only when the course is complete.");
        System.out.println("For the key programming chain, answer yes only if the minimum C rule is satisfied.");
        System.out.println();

        int completedCredits = 0;
        int completedCourses = 0;

        boolean cs150 = askCompleted("COMPSCI 150");
        if (cs150) {
            completedCredits += 3;
            completedCourses++;
        }

        boolean cs250 = askCompletedC("COMPSCI 250");
        if (cs250) {
            completedCredits += 4;
            completedCourses++;
        }

        boolean cs251 = askCompletedC("COMPSCI 251");
        if (cs251) {
            completedCredits += 4;
            completedCourses++;
        }

        boolean cs317 = askCompletedC("COMPSCI 317");
        if (cs317) {
            completedCredits += 4;
            completedCourses++;
        }

        boolean cs351 = askCompletedC("COMPSCI 351");
        if (cs351) {
            completedCredits += 4;
            completedCourses++;
        }

        boolean cs337 = askCompletedC("COMPSCI 337");
        if (cs337) {
            completedCredits += 3;
            completedCourses++;
        }

        boolean cs361 = askCompleted("COMPSCI 361");
        if (cs361) {
            completedCredits += 3;
            completedCourses++;
        }

        boolean cs395 = askCompleted("COMPSCI 395");
        if (cs395) {
            completedCredits += 3;
            completedCourses++;
        }

        boolean cs431 = askCompleted("COMPSCI 431");
        if (cs431) {
            completedCredits += 3;
            completedCourses++;
        }

        boolean cs458 = askCompletedC("COMPSCI 458");
        if (cs458) {
            completedCredits += 3;
            completedCourses++;
        }

        boolean cs535 = askCompleted("COMPSCI 535");
        if (cs535) {
            completedCredits += 3;
            completedCourses++;
        }

        boolean cs537 = askCompleted("COMPSCI 537");
        if (cs537) {
            completedCredits += 3;
            completedCourses++;
        }

        boolean cs594 = askCompleted("COMPSCI 594");
        if (cs594) {
            completedCredits += 1;
            completedCourses++;
        }

        boolean cs595 = askCompleted("COMPSCI 595");
        if (cs595) {
            completedCredits += 3;
            completedCourses++;
        }

        boolean eas200 = askCompleted("EAS 200");
        if (eas200) {
            completedCredits += 1;
            completedCourses++;
        }

        System.out.println();
        printLine();
        System.out.println("PROGRESS SUMMARY");
        printLine();
        System.out.println("Required major courses marked complete: " + completedCourses + " out of 15");
        System.out.println("Credits represented by those completed required major courses: " + completedCredits);
        System.out.println();
        System.out.println("NEXT-STEP ANALYSIS");

        if (!cs250) {
            System.out.println("- Priority: complete COMPSCI 250 with C or better.");
            System.out.println("  It is the gateway to COMPSCI 251 and the later programming chain.");
        } else if (!cs251) {
            System.out.println("- You appear ready to focus on COMPSCI 251, assuming the math prerequisite is satisfied.");
        } else if (!cs351) {
            System.out.println("- You appear ready to focus on COMPSCI 351, assuming the math prerequisite is satisfied.");
        } else {
            System.out.println("- Your core programming sequence through COMPSCI 351 appears complete.");
        }

        if (cs251 && !cs317) {
            System.out.println("- Consider completing COMPSCI 317 so you do not delay theory/algorithm requirements.");
        }

        if (cs351 && !cs337) {
            System.out.println("- COMPSCI 337 is a key next systems course after COMPSCI 351.");
        }

        if (cs351 && cs337 && !cs458) {
            System.out.println("- COMPSCI 458 is an important next step in the systems chain.");
        }

        if (cs337 && cs458 && !cs537) {
            System.out.println("- You are approaching COMPSCI 537 Operating Systems eligibility.");
        }

        if (cs351 && cs317 && !cs535) {
            System.out.println("- COMPSCI 535 may be a future option once all math and standing prerequisites are met.");
        }

        if (cs594 && !cs595) {
            System.out.println("- After capstone preparation, plan for COMPSCI 595 when eligible.");
        }

        if (completedCourses == 15) {
            System.out.println("- All required major courses entered in this checker are marked complete.");
            System.out.println("  You still need to verify math, science, GER, technical electives,");
            System.out.println("  applied mathematics, total credits, and all graduation rules.");
        }

        pause();
    }

    // ------------------------------------------------------------
    // PREREQUISITE CHAIN VIEWER
    // ------------------------------------------------------------
    public static void prerequisiteChainViewer() {
        boolean viewing = true;

        while (viewing) {
            System.out.println();
            printLine();
            System.out.println("PREREQUISITE CHAIN VIEWER");
            printLine();
            System.out.println("1 - COMPSCI 250 -> 251 -> 351");
            System.out.println("2 - COMPSCI 351 -> 337 -> 458 -> 537");
            System.out.println("3 - COMPSCI 317 + 351 -> 535");
            System.out.println("4 - COMPSCI 594 -> 595 capstone planning");
            System.out.println("5 - Why prerequisites can affect graduation time");
            System.out.println("0 - Return to main menu");
            System.out.print("Choose an option: ");

            String choice = input.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println();
                    System.out.println("PROGRAMMING CHAIN");
                    System.out.println("COMPSCI 250");
                    System.out.println("   |  Need C or better");
                    System.out.println("   v");
                    System.out.println("COMPSCI 251");
                    System.out.println("   |  Need C or better");
                    System.out.println("   v");
                    System.out.println("COMPSCI 351");
                    pause();
                    break;

                case "2":
                    System.out.println();
                    System.out.println("SYSTEMS CHAIN");
                    System.out.println("COMPSCI 351");
                    System.out.println("   |");
                    System.out.println("   v");
                    System.out.println("COMPSCI 337");
                    System.out.println("   |");
                    System.out.println("   v");
                    System.out.println("COMPSCI 458");
                    System.out.println("   |");
                    System.out.println("   v");
                    System.out.println("COMPSCI 537");
                    pause();
                    break;

                case "3":
                    System.out.println();
                    System.out.println("ALGORITHM DESIGN PREPARATION");
                    System.out.println("COMPSCI 317 + COMPSCI 351 + calculus/math preparation");
                    System.out.println("                     |");
                    System.out.println("                     v");
                    System.out.println("              COMPSCI 535");
                    System.out.println();
                    System.out.println("Current catalog details should be checked for exact standing and math alternatives.");
                    pause();
                    break;

                case "4":
                    System.out.println();
                    System.out.println("CAPSTONE PLANNING");
                    System.out.println("COMPSCI 594 - Capstone Project Preparation");
                    System.out.println("                    |");
                    System.out.println("                    v");
                    System.out.println("COMPSCI 595 - Capstone Project");
                    System.out.println();
                    System.out.println("Take capstone preparation early enough that the final capstone fits your graduation plan.");
                    pause();
                    break;

                case "5":
                    System.out.println();
                    System.out.println("WHY PREREQUISITES MATTER");
                    System.out.println("A degree is not a random list of classes. Many courses form a dependency chain.");
                    System.out.println("If Course B requires Course A, you normally cannot take B first.");
                    System.out.println("If Course C requires B, then one delay can affect several later semesters.");
                    System.out.println("This is why students should plan prerequisite chains before filling schedules");
                    System.out.println("with electives that do not unlock future requirements.");
                    pause();
                    break;

                case "0":
                    viewing = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ------------------------------------------------------------
    // GRADUATION CHECKLIST
    // ------------------------------------------------------------
    public static void graduationChecklist() {
        System.out.println();
        printLine();
        System.out.println("FINAL COMPUTER SCIENCE B.S. GRADUATION CHECKLIST");
        printLine();
        System.out.println("Use this list as a conversation guide with your advisor:");
        System.out.println();
        System.out.println("[ ] I am officially in the Computer Science Bachelor of Science program.");
        System.out.println("[ ] I will have at least 120 total applicable credits.");
        System.out.println("[ ] I completed all required COMPSCI major courses.");
        System.out.println("[ ] I completed EAS 200 Professional Seminar.");
        System.out.println("[ ] I satisfied all C-or-better prerequisite rules where required.");
        System.out.println("[ ] I satisfied the approved 4-credit mathematics requirement.");
        System.out.println("[ ] I completed the required approved natural-science credits.");
        System.out.println("[ ] My natural-science work includes the required laboratory credit.");
        System.out.println("[ ] I completed the required technical electives under my catalog year.");
        System.out.println("[ ] I completed the required applied mathematics electives under my catalog year.");
        System.out.println("[ ] My applied-math choices obey all footnotes and combination rules.");
        System.out.println("[ ] I completed all remaining GER / university requirements.");
        System.out.println("[ ] I satisfied communication/writing requirements that apply to my catalog year.");
        System.out.println("[ ] I satisfied cultural-diversity / language requirements if they apply to me.");
        System.out.println("[ ] I completed COMPSCI 594 Capstone Project Preparation.");
        System.out.println("[ ] I completed COMPSCI 595 Capstone Project.");
        System.out.println("[ ] I completed any free electives needed to reach the graduation total.");
        System.out.println("[ ] I checked my official UWM degree audit for missing requirements.");
        System.out.println("[ ] I checked that transfer credits were posted correctly.");
        System.out.println("[ ] I checked that repeated courses and grades are represented correctly.");
        System.out.println("[ ] I checked residency and upper-level credit rules with UWM.");
        System.out.println("[ ] I verified that my final-semester courses are actually offered.");
        System.out.println("[ ] I met with an advisor before my final year or final graduation application.");
        System.out.println("[ ] I applied for graduation by the university deadline.");
        System.out.println();
        System.out.println("If every applicable item is confirmed, you should have a much clearer picture");
        System.out.println("of your path toward completing the Computer Science B.S.");
        pause();
    }
}
