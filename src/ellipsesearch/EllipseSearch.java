package ellipsesearch;
import java.util.*;

public class EllipseSearch
{
    static double ellipseFits;
    public static void main(String[] args){
//        System.out.printf("\n\r\n\r  DEBUG OUTPUT");
        ellipseFits=0;
        EllipseSearch ellipseSearch = new EllipseSearch();

/*
        GregorianCalendar startDate = new GregorianCalendar();
        double startTimeSecs = (startDate.get(Calendar.MINUTE)*60)+(startDate.get(Calendar.SECOND))+(startDate.get(Calendar.MILLISECOND)/1000d);
//      TEST SEQUENCE taS=0..179, ta01=0..119, ta12=0..119
        double testMinAxis = 2.0d;
        double testMajAxis = testMinAxis*11.5d;
        double testCircleRadius = 1.0d;

        for (double taS = 0; taS<Math.PI; taS+=Math.PI/180)
        {
            System.out.printf("\n\r taS:%3.3f", Math.toDegrees(taS));
            for (double ta01 = 0; ta01<(2*Math.PI/3); ta01+=Math.PI/180)
            {
                for (double ta12 = 0; ta01<(2*Math.PI/3); ta01+=Math.PI/180)
                {
                    devicePoints[0][0] = Math.cos(0);
                    devicePoints[0][1] = Math.sin(0);
                    devicePoints[0][2] = 1d;
                    devicePoints[1][0] = Math.cos(ta01);
                    devicePoints[1][1] = Math.sin(ta01);
                    devicePoints[1][2] = 1d;
                    devicePoints[2][0] = Math.cos(ta01+ta12);
                    devicePoints[2][1] = Math.sin(ta01+ta12);
                    devicePoints[2][2] = 1d;

                    measuredPoints[0][0] = testMinAxis*Math.cos(taS);
                    measuredPoints[0][1] = testMajAxis*Math.sin(taS);

                    measuredPoints[1][0] = testMinAxis*Math.cos(taS+ta01);
                    measuredPoints[1][1] = testMajAxis*Math.sin(taS+ta01);

                    measuredPoints[2][0] = testMinAxis*Math.cos(taS+ta01+ta12);
                    measuredPoints[2][1] = testMajAxis*Math.sin(taS+ta01+ta12);

                    ellipseSearch.findPose( 0, 1, 2);
                    ellipseFits++;
                    if((Math.abs(testMinAxis-minorAxis)>0.000001)||(Math.abs(testMajAxis-majorAxis)>0.000001))
                    {
                        System.out.printf("\n\r taS:%3.3f, ta01:%3.3f, ta12:%3.3f", Math.toDegrees(taS), Math.toDegrees(ta01), Math.toDegrees(ta12));
                        System.out.printf(", minAxis:%3.3f, majAxis:%3.3f, MinMajRatio:%3.3f", minorAxis, majorAxis, majorAxis/minorAxis);
                    }
                    ellipseSearch.findPose( 0, 2, 1);
                    ellipseFits++;
                    if((Math.abs(testMinAxis-minorAxis)>0.000001)||(Math.abs(testMajAxis-majorAxis)>0.000001))
                    {
                        System.out.printf("\n\r taS:%3.3f, ta01:%3.3f, ta12:%3.3f", Math.toDegrees(taS), Math.toDegrees(ta01), Math.toDegrees(ta12));
                        System.out.printf(", minAxis:%3.3f, majAxis:%3.3f, MinMajRatio:%3.3f", minorAxis, majorAxis, majorAxis/minorAxis);
                    }
                    ellipseSearch.findPose( 1, 0, 2);
                    ellipseFits++;
                    if((Math.abs(testMinAxis-minorAxis)>0.000001)||(Math.abs(testMajAxis-majorAxis)>0.000001))
                    {
                        System.out.printf("\n\r taS:%3.3f, ta01:%3.3f, ta12:%3.3f", Math.toDegrees(taS), Math.toDegrees(ta01), Math.toDegrees(ta12));
                        System.out.printf(", minAxis:%3.3f, majAxis:%3.3f, MinMajRatio:%3.3f", minorAxis, majorAxis, majorAxis/minorAxis);
                    }
                    ellipseSearch.findPose( 1, 2, 0);
                    ellipseFits++;
                    if((Math.abs(testMinAxis-minorAxis)>0.000001)||(Math.abs(testMajAxis-majorAxis)>0.000001))
                    {
                        System.out.printf("\n\r taS:%3.3f, ta01:%3.3f, ta12:%3.3f", Math.toDegrees(taS), Math.toDegrees(ta01), Math.toDegrees(ta12));
                        System.out.printf(", minAxis:%3.3f, majAxis:%3.3f, MinMajRatio:%3.3f", minorAxis, majorAxis, majorAxis/minorAxis);
                    }
                    ellipseSearch.findPose( 2, 1, 0);
                    ellipseFits++;
                    if((Math.abs(testMinAxis-minorAxis)>0.000001)||(Math.abs(testMajAxis-majorAxis)>0.000001))
                    {
                        System.out.printf("\n\r taS:%3.3f, ta01:%3.3f, ta12:%3.3f", Math.toDegrees(taS), Math.toDegrees(ta01), Math.toDegrees(ta12));
                        System.out.printf(", minAxis:%3.3f, majAxis:%3.3f, MinMajRatio:%3.3f", minorAxis, majorAxis, majorAxis/minorAxis);
                    }
                    ellipseSearch.findPose( 2, 0, 1);
                    ellipseFits++;
                    if((Math.abs(testMinAxis-minorAxis)>0.000001)||(Math.abs(testMajAxis-majorAxis)>0.000001))
                    {
                        System.out.printf("\n\r taS:%3.3f, ta01:%3.3f, ta12:%3.3f", Math.toDegrees(taS), Math.toDegrees(ta01), Math.toDegrees(ta12));
                        System.out.printf(", minAxis:%3.3f, majAxis:%3.3f, MinMajRatio:%3.3f", minorAxis, majorAxis, majorAxis/minorAxis);
                    }
                }
            }
        }
        GregorianCalendar endDate = new GregorianCalendar();
        double endTimeSecs = (endDate.get(Calendar.MINUTE)*60)+(endDate.get(Calendar.SECOND))+(endDate.get(Calendar.MILLISECOND)/1000d);
        System.out.printf("\n\rRun time %3.3f", endTimeSecs-startTimeSecs);
        System.out.printf("\n\r ellipseFits/sec:%3.3f", ellipseFits/(endTimeSecs-startTimeSecs));
*/
        // 4, 7, 9, 16, 23, 30
        ellipseSearch.findPose( 4, 7, 9);
        ellipseSearch.findPose( 7, 9,16);
        ellipseSearch.findPose( 9,16,23);
        ellipseSearch.findPose( 4, 7,16);
        ellipseSearch.findPose( 9,23,30);
        ellipseSearch.findPose(16,23,30);
        System.out.printf("\n\r");
    }

    public void findPose(int sens0, int sens1, int sens2)
    {
        System.out.printf("\n\r -findPose( %d, %d, %d)", sens0, sens1, sens2);
        
        // Setup the circle 
        circle(sens0,sens1,sens2);
        
        double measRatioSqABBC = ((measChordAB*measChordAB)/(measChordBC*measChordBC));
        double measRatioSqACBC = ((measChordAC*measChordAC)/(measChordBC*measChordBC));
        double measRatioSqACAB = ((measChordAC*measChordAC)/(measChordAB*measChordAB));

        // Search variables
        double testFigure = 100000000000000d;
        double snapTestFigure1 = 100000000000000d;
        double snapAngleS1 = 999d;
        double snapRatio1  = 999d;
        double angleStep = Math.PI/36d;
        double angleStart = 0d;
        double angleEnd = 2*Math.PI;
        double ratioStep = 0.1d;
        double ratioStart = ratioStep;
        double ratioEnd = 12d;
        for (int iterations = 0; iterations < 11; iterations++) // Keep iterations below 20 for the minimum change of a double
        {
            for (double angleS = angleStart; angleS<angleEnd; angleS=angleS+angleStep)
            { // FC01  CG02  GF12
                double cosAngleS = Math.cos(angleS);
                double cosAngleAC = Math.cos(angleS+thetaAC);
                double cosAngleAB= Math.cos(angleS+thetaAB);
                double sinAngleS = Math.sin(angleS);
                double sinAngleAC = Math.sin(angleS+thetaAC);
                double sinAngleAB = Math.sin(angleS+thetaAB);

                for (double majorRatio=ratioStart; majorRatio < ratioEnd ; majorRatio=majorRatio+ratioStep)
                {
                    // Calculate chords
                    double mrSq = majorRatio*majorRatio;
                    double chordACSq = ((cosAngleS-cosAngleAC) *(cosAngleS-cosAngleAC))  + mrSq*((sinAngleS-sinAngleAC) *(sinAngleS-sinAngleAC));
                    double chordABSq = ((cosAngleS-cosAngleAB) *(cosAngleS-cosAngleAB))  + mrSq*((sinAngleS-sinAngleAB) *(sinAngleS-sinAngleAB));
                    double chordBCSq = ((cosAngleAC-cosAngleAB)*(cosAngleAC-cosAngleAB)) + mrSq*((sinAngleAC-sinAngleAB)*(sinAngleAC-sinAngleAB));

                    // Test chords
                    testFigure =  (((chordABSq/chordBCSq)-measRatioSqABBC) * ((chordABSq/chordBCSq)-measRatioSqABBC)) +
                                  (((chordACSq/chordBCSq)-measRatioSqACBC) * ((chordACSq/chordBCSq)-measRatioSqACBC)) +
                                  (((chordACSq/chordABSq)-measRatioSqACAB) * ((chordACSq/chordABSq)-measRatioSqACAB));
                    testFigure =  Math.sqrt(testFigure);
                    if(snapTestFigure1 > testFigure)
                    {
                        snapTestFigure1 = testFigure;
                        snapAngleS1 = angleS;
                        snapRatio1  = majorRatio;
                    }
                }
            }
            angleStart = snapAngleS1-angleStep*2;
            angleEnd   = snapAngleS1+angleStep*2;
            angleStep  = angleStep/4d;
            ratioStart = snapRatio1-ratioStep*2;
            ratioEnd   = snapRatio1+ratioStep*2;
            ratioStep  = ratioStep/4d;
        }

        // Search variables
        testFigure = 100000000000000d;
        double snapTestFigure2 = 100000000000000d;
        double snapAngleS2 = 999d;
        double snapRatio2  = 999d;
        angleStep = Math.PI/(4d*36d);
        angleStart = Math.PI+ snapAngleS1-(angleStep*1.5);
        angleEnd   = Math.PI+ snapAngleS1+(angleStep*1.5);
        ratioStep = 0.1d;
        ratioStart = 1d;
        ratioEnd   = 12d;
        for (int iterations = 0; iterations < 11; iterations++) // Keep iterations below 20 for the minimum change of a double
        {
            for (double angleS = angleStart; angleS<angleEnd; angleS=angleS+angleStep)
            { // FC01  CG02  GF12
                double cosAngleS = Math.cos(angleS);
                double cosAngleAC = Math.cos(angleS+thetaAC);
                double cosAngleAB= Math.cos(angleS+thetaAB);
                double sinAngleS = Math.sin(angleS);
                double sinAngleAC = Math.sin(angleS+thetaAC);
                double sinAngleAB = Math.sin(angleS+thetaAB);

                for (double majorRatio=ratioStart; majorRatio < ratioEnd ; majorRatio=majorRatio+ratioStep)
                {
                    // Calculate chords
                    double mrSq = majorRatio*majorRatio;
                    double chordACSq = (mrSq*(cosAngleS-cosAngleAC) *(cosAngleS-cosAngleAC))  + ((sinAngleS-sinAngleAC) *(sinAngleS-sinAngleAC));
                    double chordABSq = (mrSq*(cosAngleS-cosAngleAB) *(cosAngleS-cosAngleAB))  + ((sinAngleS-sinAngleAB) *(sinAngleS-sinAngleAB));
                    double chordBCSq = (mrSq*(cosAngleAC-cosAngleAB)*(cosAngleAC-cosAngleAB)) + ((sinAngleAC-sinAngleAB)*(sinAngleAC-sinAngleAB));

                    // Test chords
                    testFigure =  (((chordABSq/chordBCSq)-measRatioSqABBC) * ((chordABSq/chordBCSq)-measRatioSqABBC)) +
                                  (((chordACSq/chordBCSq)-measRatioSqACBC) * ((chordACSq/chordBCSq)-measRatioSqACBC)) +
                                  (((chordACSq/chordABSq)-measRatioSqACAB) * ((chordACSq/chordABSq)-measRatioSqACAB));
                    testFigure =  Math.sqrt(testFigure);
                    if(snapTestFigure2 > testFigure)
                    {
                        snapTestFigure2 = testFigure;
                        snapAngleS2 = angleS;
                        snapRatio2  = majorRatio;
                    }
                }
            }
            angleStart = snapAngleS2-angleStep*2;
            angleEnd   = snapAngleS2+angleStep*2;
            angleStep  = angleStep/4d;
            ratioStart = snapRatio2-ratioStep*2;
            ratioEnd   = snapRatio2+ratioStep*2;
            ratioStep  = ratioStep/4d;
        }
        
        double snapRatio = (snapRatio1+snapRatio2)/2;
        double snapAngleS = (snapAngleS1+snapAngleS2-Math.PI)/2;

//        double snapRatio = snapRatio1;
//        double snapAngleS = snapAngleS1;

        double mrSq = snapRatio*snapRatio;
        double cosAngleS = Math.cos(snapAngleS);
        double cosAngleAC = Math.cos(snapAngleS+thetaAC);
        double cosAngleAB= Math.cos(snapAngleS+thetaAB);
        double sinAngleS = Math.sin(snapAngleS);
        double sinAngleAC = Math.sin(snapAngleS+thetaAC);
        double sinAngleAB = Math.sin(snapAngleS+thetaAB);
        double chordAC = Math.sqrt(((cosAngleS-cosAngleAC)*(cosAngleS-cosAngleAC))   + mrSq*((sinAngleS-sinAngleAC)*(sinAngleS-sinAngleAC)));
        double chordAB = Math.sqrt(((cosAngleS-cosAngleAB)*(cosAngleS-cosAngleAB))   + mrSq*((sinAngleS-sinAngleAB)*(sinAngleS-sinAngleAB)));
        double chordBC = Math.sqrt(((cosAngleAC-cosAngleAB)*(cosAngleAC-cosAngleAB)) + mrSq*((sinAngleAC-sinAngleAB)*(sinAngleAC-sinAngleAB)));
        minorAxis = ((measChordAB/chordAB)+(measChordAC/chordAC)+(measChordBC/chordBC))/3;
        majorAxis = snapRatio*minorAxis;

//      System.out.printf("\n\r     chordAB:%3.3f,     chordBC:%3.3f,     chordAC:%3.3f", chordAB*minorAxis, chordBC*minorAxis, chordAC*minorAxis);
        System.out.printf("\n\r **** minAxis:%3.6f, majAxis:%3.6f, SlideAngle:%3.6f, MinMajRatio:%3.6f", minorAxis, majorAxis, Math.toDegrees(snapAngleS), snapRatio);
        System.out.printf("\n\r **** %3.6fm DISTANCE\n\r", CircleRadius/Math.tan(Math.toRadians(majorAxis)));
    }

    public void circle(int sens0, int sens1, int sens2)
    {
//        System.out.printf("\n\r - circle(%d, %d, %d)", sens0, sens1, sens2);
        double Cenx0, Cenx1, Cenx2, Cenx3, Cenx4; 
        circleAttempt(sens0, sens1, sens2);
        Cenx0 = Cenx; 
        circleAttempt(sens0, sens2, sens1);
        Cenx1 = Cenx; 
        circleAttempt(sens1, sens0, sens2);
        Cenx2 = Cenx; 
        if((Math.abs(Cenx0-Cenx1)<0.0000001)&&(Math.abs(Cenx1-Cenx2)<0.0000001)) // 012
        {
//            System.out.printf("\n\r - 012 Match, going with 2");
        } else
        {
            circleAttempt(sens1, sens2, sens0);
            Cenx3 = Cenx;
            if(((Math.abs(Cenx0-Cenx1)<0.0000001)&&(Math.abs(Cenx1-Cenx3)<0.0000001)) || // 013
               ((Math.abs(Cenx0-Cenx2)<0.0000001)&&(Math.abs(Cenx2-Cenx3)<0.0000001)) || // 023
               ((Math.abs(Cenx1-Cenx2)<0.0000001)&&(Math.abs(Cenx2-Cenx3)<0.0000001)))   // 123
            {
//                System.out.printf("\n\r - 3 Matches, going with 3");
            } else
            {
//                System.out.printf("\n\r - 4 Must be correct as two incorrect in 0123, going with 4");
                circleAttempt(sens2, sens0, sens1);
            }
        }

//        System.out.printf("  FINAL:(%d, %d, %d)", usedSensor0, usedSensor1, usedSensor2);
        
        // CALCULATE ELLIPSE
//        System.out.printf("\n\r    (x0:%3.3f, y0:%3.3f, z0:%3.3f),", x0, y0, z0);
//        System.out.printf("\n\r    (x1:%3.3f, y1:%3.3f, z1:%3.3f),", x1, y1, z1);
//        System.out.printf("\n\r    (x2:%3.3f, y2:%3.3f, z2:%3.3f)", x2, y2, z2);
        double Ang012 = angleThreePoints(x0, y0, z0, x1, y1, z1, x2, y2, z2);
        double Ang102 = angleThreePoints(x1, y1, z1, x0, y0, z0, x2, y2, z2);
        double Ang120 = angleThreePoints(x1, y1, z1, x2, y2, z2, x0, y0, z0);
        
        double AngAB = 0d;
        double AngBC = 0d;
        double AngAC = 0d;
        if ((Ang102>Ang012)&&(Ang102>Ang120))
        {
            // 0 is the centre A, B, C seq
            //                 2, 0, 1 seq
//            System.out.printf("\n\r - 0 Centre of Arc");
            AngAB = angleThreePoints(x2, y2, z2, Cenx, Ceny, Cenz, x0, y0, z0); // 2-0
            AngBC = angleThreePoints(x0, y0, z0, Cenx, Ceny, Cenz, x1, y1, z1); // 2-0
            // 2-0
            measChordAB = Math.sqrt((measuredPoints[usedSensor2][0]-measuredPoints[usedSensor0][0])*(measuredPoints[usedSensor2][0]-measuredPoints[usedSensor0][0])+
                                    (measuredPoints[usedSensor2][1]-measuredPoints[usedSensor0][1])*(measuredPoints[usedSensor2][1]-measuredPoints[usedSensor0][1]));
            // 2-1
            measChordAC = Math.sqrt((measuredPoints[usedSensor2][0]-measuredPoints[usedSensor1][0])*(measuredPoints[usedSensor2][0]-measuredPoints[usedSensor1][0])+
                                    (measuredPoints[usedSensor2][1]-measuredPoints[usedSensor1][1])*(measuredPoints[usedSensor2][1]-measuredPoints[usedSensor1][1]));
            // 0-1
            measChordBC = Math.sqrt((measuredPoints[usedSensor0][0]-measuredPoints[usedSensor1][0])*(measuredPoints[usedSensor0][0]-measuredPoints[usedSensor1][0])+
                                    (measuredPoints[usedSensor0][1]-measuredPoints[usedSensor1][1])*(measuredPoints[usedSensor0][1]-measuredPoints[usedSensor1][1]));
        } else if ((Ang012>Ang102)&&(Ang012>Ang120))
        {
            // 1 is the centre A, B, C seq
            //                 0, 1, 2 seq
//            System.out.printf("\n\r - 1 Centre of Arc");
            AngAB = angleThreePoints(x0, y0, z0, Cenx, Ceny, Cenz, x1, y1, z1); // 0-1
            AngBC = angleThreePoints(x1, y1, z1, Cenx, Ceny, Cenz, x2, y2, z2); // 1-2
            // 0-1
            measChordAB = Math.sqrt((measuredPoints[usedSensor0][0]-measuredPoints[usedSensor1][0])*(measuredPoints[usedSensor0][0]-measuredPoints[usedSensor1][0])+
                                    (measuredPoints[usedSensor0][1]-measuredPoints[usedSensor1][1])*(measuredPoints[usedSensor0][1]-measuredPoints[usedSensor1][1]));
            // 0-2
            measChordAC = Math.sqrt((measuredPoints[usedSensor0][0]-measuredPoints[usedSensor2][0])*(measuredPoints[usedSensor0][0]-measuredPoints[usedSensor2][0])+
                                    (measuredPoints[usedSensor0][1]-measuredPoints[usedSensor2][1])*(measuredPoints[usedSensor0][1]-measuredPoints[usedSensor2][1]));
            // 1-2
            measChordBC = Math.sqrt((measuredPoints[usedSensor1][0]-measuredPoints[usedSensor2][0])*(measuredPoints[usedSensor1][0]-measuredPoints[usedSensor2][0])+
                                    (measuredPoints[usedSensor1][1]-measuredPoints[usedSensor2][1])*(measuredPoints[usedSensor1][1]-measuredPoints[usedSensor2][1]));
        } else if ((Ang120>Ang102)&&(Ang120>Ang012))
        {
            // 2 is the centre A, B, C seq
            //                 1, 2, 0 seq
//            System.out.printf("\n\r - 2 Centre of Arc");
            AngAB = angleThreePoints(x1, y1, z1, Cenx, Ceny, Cenz, x2, y2, z2); // 1-2
            AngBC = angleThreePoints(x2, y2, z2, Cenx, Ceny, Cenz, x0, y0, z0); // 2-0
            // 1-2
            measChordAB = Math.sqrt((measuredPoints[usedSensor1][0]-measuredPoints[usedSensor2][0])*(measuredPoints[usedSensor1][0]-measuredPoints[usedSensor2][0])+
                                    (measuredPoints[usedSensor1][1]-measuredPoints[usedSensor2][1])*(measuredPoints[usedSensor1][1]-measuredPoints[usedSensor2][1]));
            // 1-0
            measChordAC = Math.sqrt((measuredPoints[usedSensor1][0]-measuredPoints[usedSensor0][0])*(measuredPoints[usedSensor1][0]-measuredPoints[usedSensor0][0])+
                                    (measuredPoints[usedSensor1][1]-measuredPoints[usedSensor0][1])*(measuredPoints[usedSensor1][1]-measuredPoints[usedSensor0][1]));
            // 2-0
            measChordBC = Math.sqrt((measuredPoints[usedSensor2][0]-measuredPoints[usedSensor0][0])*(measuredPoints[usedSensor2][0]-measuredPoints[usedSensor0][0])+
                                    (measuredPoints[usedSensor2][1]-measuredPoints[usedSensor0][1])*(measuredPoints[usedSensor2][1]-measuredPoints[usedSensor0][1]));
        }
        
        thetaAB = AngAB;
        thetaAC = AngAB+AngBC;
//        System.out.printf("\n\r - Cenx:%3.3f, Ceny:%3.3f, Cenz:%3.3f, CircleRadius:%3.3f", Cenx, Ceny, Cenz, CircleRadius);
//        System.out.printf("\n\r       AngAB:%3.3f,     AngBC:%3.3f,     AngAC:%3.3f", AngAB, AngBC, AngAC);
//        System.out.printf("\n\r - thetaAB:%3.3f, thetaAC:%3.3f, AngAB+AngBC:%3.3f", thetaAB, thetaAC, AngAB+AngBC);
//        System.out.printf("\n\r measChordAB:%3.3f, measChordBC:%3.3f, measChordAC:%3.3f", measChordAB, measChordBC, measChordAC);
    }


    public void circleAttempt(int sens0, int sens1, int sens2)
    {
        // Single attempt at working out a circle this will encounter a singularity 1:3 times with some data
        usedSensor0 = sens0; usedSensor1 = sens1; usedSensor2 = sens2;
        x0 = devicePoints[sens0][0]; y0 = devicePoints[sens0][1]; z0 = devicePoints[sens0][2];
        x1 = devicePoints[sens1][0]; y1 = devicePoints[sens1][1]; z1 = devicePoints[sens1][2];
        x2 = devicePoints[sens2][0]; y2 = devicePoints[sens2][1]; z2 = devicePoints[sens2][2];
        double L01 = Math.sqrt(((x0-x1)*(x0-x1)) + ((y0-y1)*(y0-y1)) + ((z0-z1)*(z0-z1)));
        double L12 = Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)) + ((z1-z2)*(z1-z2)));
        double L02 = Math.sqrt(((x0-x2)*(x0-x2)) + ((y0-y2)*(y0-y2)) + ((z0-z2)*(z0-z2)));
        double DC01i = (x1-x0) / L01;
        double DC01j = (y1-y0) / L01;
        double DC01k = (z1-z0) / L01;
        double DC02i = (x2-x0) / L02;
        double DC02j = (y2-y0) / L02;
        double DC02k = (z2-z0) / L02;
        double cos102 = ((L01*L01) + (L02*L02) - (L12*L12)) / (2 * L01 * L02);
        double AD = cos102 * L02;
        double CD = Math.sqrt(L02*L02 - AD*AD);
        double Xd = x0 + (AD * DC01i);
        double Yd = y0 + (AD * DC01j);
        double Zd = z0 + (AD * DC01k);
        double CDi = (x2 - Xd) / CD;
        double CDj = (y2 - Yd) / CD;
        double CDk = (z2 - Zd) / CD;
        double Ni = (DC01k * CDj) - (DC01j * CDk);
        double Nj = (DC01i * CDk) - (DC01k * CDi);
        double Nk = (DC01j * CDi) - (DC01i * CDj);
        double sin102 = Math.sqrt(1 - cos102*cos102);
        double R = (L12 / sin102) / 2;
        double X2e = L01 / 2;
        double Y2e = Math.sqrt(R*R - X2e*X2e);
        double Z2e = 0;
        Cenx = x0 + (X2e * DC01i) + (Y2e * CDi) + (Z2e * Ni);
        Ceny = y0 + (X2e * DC01j) + (Y2e * CDj) + (Z2e * Nj);
        Cenz = z0 + (X2e * DC01k) + (Y2e * CDk) + (Z2e * Nk);
        CircleRadius = Math.sqrt((Cenx-x0)*(Cenx-x0)+(Ceny-y0)*(Ceny-y0)+(Cenz-z0)*(Cenz-z0));
    }
    
    double angleThreePoints(double x0, double y0, double z0, 
                            double Cenx, double Ceny, double Cenz,
                            double x1, double y1, double z1)
    {
        double V1x = x0-Cenx; double V1y = y0-Ceny; double V1z = z0-Cenz;
        double V2x = x1-Cenx; double V2y = y1-Ceny; double V2z = z1-Cenz;
        double V1mag = Math.sqrt(V1x*V1x+V1y*V1y+V1z*V1z);
        double V2mag = Math.sqrt(V2x*V2x+V2y*V2y+V2z*V2z);
        double V1Normx = V1x/V1mag; double V1Normy = V1y/V1mag; double V1Normz = V1z/V1mag; 
        double V2Normx = V2x/V2mag; double V2Normy = V2y/V2mag; double V2Normz = V2z/V2mag; 
        double Vdot = V1Normx*V2Normx+V1Normy*V2Normy+V1Normz*V2Normz;
        double AngAB = Math.acos(Vdot);
        return AngAB;
    }

    static double Cenx; static double Ceny; static double Cenz;
    static double x0; static double y0; static double z0;
    static double x1; static double y1; static double z1;
    static double x2; static double y2; static double z2;
    static int usedSensor0; static int usedSensor1; static int usedSensor2;
    static double thetaAB;
    static double thetaAC;
    static double CircleRadius;
    static double measChordAB;
    static double measChordAC;
    static double measChordBC;
    static double minorAxis;
    static double majorAxis;
/*
    static double[][] measuredPoints = {{89.097,132.264} ,{86.928,137.236} ,{91.032,136.002} ,{95.349,137.501} ,{94.312,133.839} ,{95.290,131.073}};
    static double[][] devicePoints = {{18, 4, 3},{0, 0, 0},{5, 10, 3},{0, 21, 0},{13, 18, 3},{23, 21, 0}};
*/
    
    static double[][] measuredPoints = {
        {0, 0}, // 0
        {0, 0}, // 1
        {0, 0}, // 2
        {0, 0}, // 3
        {6.5013000, -11.4747000}, // 4
        {0, 0}, // 5
        {0, 0}, // 6
        {6.0126000, -11.6337000}, // 7
        {0, 0}, // 8
        {6.0954000, -12.0105000}, // 9
        {0, 0}, // 10
        {0, 0}, // 11
        {0, 0}, // 12
        {0, 0}, // 13
        {0, 0}, // 14
        {0, 0}, // 15
        {4.8219000, -11.3229000}, // 16
        {0, 0}, // 17
        {0, 0}, // 18
        {0, 0}, // 19
        {0, 0}, // 20
        {0, 0}, // 21
        {0, 0}, // 22
        {4.3806000, -11.3022000}, // 23
        {0, 0}, // 24
        {0, 0}, // 25
        {0, 0}, // 26
        {0, 0}, // 27
        {0, 0}, // 28
        {0, 0}, // 29
        {4.6500000, -11.6337000}, // 30
        {0, 0}  // 31
        };
    static double[][] devicePoints = {
        {0.08518143743276596,0.017062144353985786,0.04640356823801994},
        {0.09299874305725098,-9.77110757958144e-05,0.03490303456783295},
        {0.0866357758641243,0.016550032421946526,0.020586593076586723},
        {0.0896136462688446,0.029156366363167763,0.0296088345348835},
        {0.07996707409620285,0.04522520303726196,0.03478708118200302},
        {0.05082200840115547,0.0525379441678524,0.03328508138656616},
        {0.02431630529463291,0.0200039092451334,0.05943312123417854},
        {0.04736604541540146,0.03358921408653259,0.05357927456498146},
        {0.04778143763542175,-0.034000154584646225,0.05348391830921173},
        {0.05795735865831375,-3.651010774774477e-05,0.05651696398854256},
        {0.02757195383310318,-0.051707036793231964,0.046649035066366196},
        {0.05145823583006859,-0.05293474718928337,0.03312348574399948},
        {0.08054577559232712,-0.04522349312901497,0.03467874228954315},
        {0.08995519578456879,-0.029309064149856567,0.02968563325703144},
        {0.0868583470582962,-0.016645202413201332,0.020546138286590576},
        {0.08528480678796768,-0.01717553101480007,0.04645363613963127},
        {-0.04789695516228676,0.03364776074886322,0.05359702929854393},
        {-0.02451552450656891,0.020054345950484276,0.05939493328332901},
        {-0.05120636895298958,0.05282235145568848,0.033184923231601715},
        {-0.08026022464036942,0.045291341841220856,0.034813448786735535},
        {-0.08975434303283691,0.02939225733280182,0.029623806476593018},
        {-0.08676112443208694,0.01667257957160473,0.02072800137102604},
        {-0.09296955168247223,0.00019559808424673975,0.034909311681985855},
        {-0.08538919687271118,0.01735016517341137,0.046313270926475525},
        {-0.08526882529258728,-0.017100226134061813,0.046251364052295685},
        {-0.08669501543045044,-0.016456371173262596,0.020705312490463257},
        {-0.08958882093429565,-0.0292942076921463,0.029727233573794365},
        {-0.08019855618476868,-0.04522521793842316,0.0346868671476841},
        {-0.05091847851872444,-0.052784282714128494,0.03316209465265274},
        {-0.027258513495326042,-0.051615241914987564,0.04688679054379463},
        {-0.0580756776034832,6.801447852922138e-06,0.05650037154555321},
        {-0.047557104378938675,-0.03394269943237305,0.0535212866961956}
        };
    static double[][] deviceNormals = {
        {0.6565292477607727,0.08003702759742737,0.7500423192977905},
        {1,0,0},
        {0.9510334134101868,0.1922958791255951,-0.24198685586452484},
        {0.8633409738540649,0.26114100217819214,-0.43179601430892944},
        {0.5620832443237305,0.8270804286003113,-0.0007020003395155072},
        {0.5567418932914734,0.8186168074607849,-0.1410849690437317},
        {0.12751400470733643,0.36096900701522827,0.9238190054893494},
        {0.19732795655727386,0.7212077975273132,0.6640188097953796},
        {0.19732792675495148,-0.7205037474632263,0.6647827625274658},
        {0.4602000117301941,0.003066000062972307,0.8878099918365479},
        {0.025263000279664993,-0.7483329772949219,0.6628419756889343},
        {0.5567419528961182,-0.8187658786773682,-0.14021699130535126},
        {0.5620829463005066,-0.8270809054374695,0.00017499997920822352},
        {0.8633410930633545,-0.26159802079200745,-0.4315190613269806},
        {0.9510335326194763,-0.19255191087722778,-0.24178287386894226},
        {0.6565289497375488,-0.07924199104309082,0.7501268982887268},
        {-0.19732795655727386,0.7212077975273132,0.6640188097953796},
        {-0.12751400470733643,0.36096900701522827,0.9238190054893494},
        {-0.5567418932914734,0.8186168074607849,-0.1410849690437317},
        {-0.5620832443237305,0.8270804286003113,-0.0007020003395155072},
        {-0.8633409738540649,0.26114100217819214,-0.43179601430892944},
        {-0.9510334134101868,0.1922958791255951,-0.24198685586452484},
        {-1,0,0},
        {-0.6565292477607727,0.08003702759742737,0.7500423192977905},
        {-0.6565289497375488,-0.07924199104309082,0.7501268982887268},
        {-0.9510335326194763,-0.19255191087722778,-0.24178287386894226},
        {-0.8633410930633545,-0.26159802079200745,-0.4315190613269806},
        {-0.5620829463005066,-0.8270809054374695,0.00017499997920822352},
        {-0.5567419528961182,-0.8187658786773682,-0.14021699130535126},
        {-0.025263000279664993,-0.7483329772949219,0.6628419756889343},
        {-0.4602000117301941,0.003066000062972307,0.8878099918365479},
        {-0.19732792675495148,-0.7205037474632263,0.6647827625274658}
        };

}
