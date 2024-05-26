import java.util.Scanner;

     public class Main {
     public static void main(String[] args) {
             Scanner in = new Scanner(System.in);
                     System.out.println("اهلاً وسهلاً في معرض أكرم لبيع السيارات");
                     System.out.println("----------------------------------------------------------------------------------");
        int Type_Car;
        int Car_Price;
        int Model; 

                   System.out.println("\n"+"أي نوع من السيارات ترغب في شرائه؟");
        do {
                   System.out.println("1- تويوتا" + "\n" + "2- هيونداي" + "\n" + "3- مرسيدس" + "\n" + "4- الخروج");

      Type_Car = in.nextInt();
          switch (Type_Car) {
                                          case 1:
                  System.out.println("..................................................................................");
                  System.out.println("تويوتا");
                  System.out.println("يوجد في معرضنا اجمل انواع سيارات تيوتا");
                  System.out.println("اي موديل تريد");
       do {
                 System.out.println("1-2018" + "\n" + "2-2019" + "\n" + "3-2020"+"\n"+"4-2021"+"\n"+"5-2022"+"\n"+"6-2023"+"\n"+"7-الخروج");
     Model = in.nextInt();
                 switch (Model) {
                           case 1   :
     
                  System.out.println("يتميز هذا الموديل 1-القوة      2-اقتصادي       3-رخيص الثمن       ");
                   System.out.println("ابيض اللون ");
         Car_Price = 20000;
                    System.out.println("سعر السيارة: " + Car_Price + "$");
                    System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                    System.out.println("Enter 0 to exit");
   int Sale_Amount= in.nextInt();
             if (Sale_Amount == Car_Price) 
                      System.out.println("تمت العملية بنجاح ");
                 else if(Sale_Amount!=0)
                       System.out.println("خطأ في ادخال المبلغ");
                                break;
                                
                                    case 2:
                       System.out.println(" من مميزاتها          1-القوه        2-سعر مناسب      3-  6بستون");
                       System.out.println("الون اسود");
              Car_Price = 25000;
                      System.out.println("سعر السيارة: " + Car_Price + "$");  
                      System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                      System.out.println("Enter 0 to exit");
      Sale_Amount= in.nextInt();                     
              if (Sale_Amount == Car_Price ) 
                       System.out.println("تمت العملية بنجاج");            
              else if(Sale_Amount!=0)
                        System.out.println("خطأ في ادخال المبلغ");   
                                 break;
 
                                   case 3:
                        System.out.println(" صفاته: 1- مريح      2-اقتصادي للبنزين       3- سعر مناسب");
                        System.out.println("لون رمادي");
               Car_Price = 30000;
                       System.out.println("سعر السيارة: " + Car_Price + "$");   
                       System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                       System.out.println("Enter 0 to exit");
      Sale_Amount = in.nextInt();
            if (Sale_Amount == Car_Price) 
                        System.out.println("تمت العملية بنجاح ");
               else if(Sale_Amount!=0)
                         System.out.println("خطأ في ادخال المبلغ");
                                    break;
                                    
                                     case 4:
                          System.out.println("مميزاته :     1- اصدار حديث         2-راحه شامله       3-اقتصادي");
                          System.out.println("لون ابيض");
                Car_Price = 40000;
                          System.out.println("سعر السيارة: " + Car_Price + "$");  
                          System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                          System.out.println("Enter 0 to exit");
      Sale_Amount = in.nextInt();
            if (Sale_Amount == Car_Price ) 
                            System.out.println("تمت العملية بنجاج");            
               else if(Sale_Amount!=0)
                            System.out.println("خطأ في ادخال المبلغ");   
                                           break;
                                
                                         case 5:
                             System.out.println("مميزاته :     1- اصدار حديث         2-راحه شامله       3-اقتصادي");
                             System.out.println("لون ابيض");
                   Car_Price = 50000;
                              System.out.println("سعر السيارة: " + Car_Price + "$"); 
                              System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                              System.out.println("Enter 0 to exit");
     Sale_Amount= in.nextInt();
            if (Sale_Amount== Car_Price ) 
                              System.out.println("تمت العملية بنجاج");            
              else if(Sale_Amount!=0)
                              System.out.println("خطأ في ادخال المبلغ");   
                                             break;
                                
                                        case 6:
                             System.out.println("مميزاته :     1- اصدار حديث   2-اقتصادي  4بستون           3-مريح جدا");
                             System.out.println("لون احمر");
         Car_Price =70000;
                             System.out.println("سعر السيارة: " + Car_Price + "$");  
                             System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                             System.out.println("Enter 0 to exit");
  Sale_Amount = in.nextInt();
             if (Sale_Amount== Car_Price ) 
                            System.out.println("تمت العملية بنجاج");            
                  else if(Sale_Amount!=0)
                            System.out.println("خطأ في ادخال المبلغ");   
                                             break;
                                             
                                        case 7:
                           System.out.println("لقد تم الخروج بنجاح");
                           System.out.println("...............................................................................");
                                            break;
                                 default:
                          System.out.println("خطأ، يرجى اختيار بشكل صحيح");
                                 
                         

                        }
                    } while (Model != 7);
                                 break;
                    
      
                                                 case 2:
                        System.out.println("..................................................................................");
                
                        System.out.println("يوجد في معرضنا اجمل انواع سيارات هيونداي");
                        System.out.println("اي موديل تريد");
            do {
                        System.out.println("1-2018" + "\n" + "2-2020" + "\n" + "3-2021"+"\n"+"4-2023"+"\n"+"5-الخروج");
           Model = in.nextInt();
                      switch (Model) {
                                    
                                    case 1   :
                        System.out.println("يتميز هذا الموديل 1-القوة      2-اقتصادي       3-رخيص الثمن       ");
                       System.out.println("لون  اسود");
             Car_Price = 15000;
                      System.out.println("سعر السيارة: " + Car_Price + "$");
                      System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                      System.out.println("Enter 0 to exit");
       int Sale_Amount= in.nextInt();
           if (Sale_Amount== Car_Price) 
                      System.out.println("تمت العملية بنجاح ");
              else if(Sale_Amount!=0)
                      System.out.println("خطأ في ادخال المبلغ");
                                 break;
                                 
                                 case 2:
                      System.out.println(" من مميزاتها          1-القوه        2-سعر مناسب      3-  6بستون");
                      System.out.println("الون اسود");
        Car_Price = 37000;
                     System.out.println("سعر السيارة: " + Car_Price + "$");  
                     System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                     System.out.println("Enter 0 to exit");
   Sale_Amount= in.nextInt();                     
          if (Sale_Amount== Car_Price ) 
                      System.out.println("تمت العملية بنجاج");            
             else if(Sale_Amount!=0)
                       System.out.println("خطأ في ادخال المبلغ");   
                                        break;
 
                                    case 3:
                        System.out.println(" صفاته: 1- ضمانه   2-  قوه للتحمل         3-   6-بستون");
                        System.out.println("لون ازرق");
       Car_Price = 40000;
                       System.out.println("سعر السيارة: " + Car_Price + "$");   
                       System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                       System.out.println("Enter 0 to exit");
    Sale_Amount= in.nextInt();
         if (Sale_Amount == Car_Price) 
                      System.out.println("تمت العملية بنجاح ");
             else if(Sale_Amount!=0)
                       System.out.println("خطأ في ادخال المبلغ");
                                           break;
                                
                                  case 4:
                       System.out.println(" من مميزاتها 1-اكثر راحه      2-مكينتها قوي   3- 6-بستون");
                       System.out.println("لون بني");
         Car_Price = 45000;
                       System.out.println("سعر السيارة: " + Car_Price + "$");   
                       System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                       System.out.println("Enter 0 to exit");
   Sale_Amount = in.nextInt();
            if (Sale_Amount== Car_Price) 
                       System.out.println("تمت العملية بنجاح ");
               else if(Sale_Amount!=0)
                        System.out.println("خطأ في ادخال المبلغ");
                                                break;
             
                                  case 5:             
                         System.out.println("لقد تم الخروج بنجاح");                          
                         System.out.println("...........................................................");
                                                   break;
                            default:
                        System.out.println("خطأ، يرجى اختيار بشكل صحيح");
                            
                         

                        }
                    } while (Model != 5);
                                    break;

                                               case 3:
                        System.out.println("..................................................................................");
                        System.out.println("يوجد في معرضنا اجمل انواع سيارات مرسديس");
                        System.out.println("اي موديل تريد");
                    do {
                        System.out.println("1-2017" + "\n" + "2-2019" + "\n" + "3-2020"+"\n"+"4-2023"+"\n"+"5-الخروج");
          Model = in.nextInt();
                            switch (Model) {
                      
                                  case 1   :
                         System.out.println("يتميز هذا الموديل 1-القوة      2-اقتصادي       3-رخيص نسبيا");
                         System.out.println("لون  بيج");
     Car_Price = 25000;
                         System.out.println("سعر السيارة: " + Car_Price + "$");
                          System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                          System.out.println("Enter 0 to exit");
   int Sale_Amount = in.nextInt();
              if (Sale_Amount == Car_Price) 
                           System.out.println("تمت العملية بنجاح ");
                  else if(Sale_Amount!=0)
                            System.out.println("خطأ في ادخال المبلغ");
                                             break;
                                             
                                      case 2:
                            System.out.println(" من مميزاتها          1-شكلها جميل        2-  مريحة في جميع الجوانب    3-  8-بستون");
                            System.out.println("لون اابيض");
        Car_Price = 40000;
                             System.out.println("سعر السيارة: " + Car_Price + "$");  
                             System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                              System.out.println("Enter 0 to exit");
  Sale_Amount= in.nextInt();                     
           if (Sale_Amount== Car_Price ) 
                              System.out.println("تمت العملية بنجاج");            
                else if(Sale_Amount!=0)
                              System.out.println("خطأ في ادخال المبلغ");   
                                                break;
 
                                        case 3:
                              System.out.println(" صفاته: 1-مضمون من المعرض     2- راحه            3- شكل فخم");
                              System.out.println("لون ازرق");
                Car_Price = 50000;
                                System.out.println("سعر السيارة: " + Car_Price + "$");   
                                System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                                System.out.println("Enter 0 to exit");
     Sale_Amount= in.nextInt();
             if (Sale_Amount == Car_Price) 
                             System.out.println("تمت العملية بنجاح ");
                 else if(Sale_Amount!=0)
                                System.out.println("خطأ في ادخال المبلغ");
                                                  break;
                                
                                           case 4:
                                      System.out.println(" من مميزاتها 1-جديد      2-قوة في التحمل     3-8بستون        4-سرعة خياليه");
                                      System.out.println("لون اسود ");
         Car_Price = 70000;
                                      System.out.println("سعر السيارة: " + Car_Price + "$");   
                                      System.out.println("اذا كنت تريد شراء السياره أدخل المبلغ");
                                       System.out.println("Enter 0 to exit");         
    Sale_Amount= in.nextInt();
              if (Sale_Amount == Car_Price) 
                                        System.out.println("تمت العملية بنجاح ");
                   else if(Sale_Amount!=0)
                                         System.out.println("خطأ في ادخال المبلغ");
                                                        break;
                                                        
                                                   case 5:
                                         System.out.println("لقد تم الخروج بنجاح");
                                         System.out.println("...........................................................");
                                                        break;
                                          default:
                                          System.out.println("خطأ، يرجى اختيار بشكل صحيح");
                            
                         

                        }
                    } while (Model != 5);
                    break;
                   
                                                      case 4:
                              System.out.println("الخروج");
                                               break;
                            default:
                                System.out.println("خطأ، يرجى اختيار بشكل صحيح");
            }
        } while (Type_Car != 4);
    

    }
}