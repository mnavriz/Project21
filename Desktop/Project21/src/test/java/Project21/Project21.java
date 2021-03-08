package Project21;

public class Project21 {
}
/*
For this project you need to use Rest Assured Libraries

Authentication Info:
Base URI:  https://test.campus.techno.study
Username:  daulet2030@gmail.com
Password:  TechnoStudy123@


--- PART 1 ---

Create - Edit - Delete Discount

Api Path: "/school-service/api/discounts"

Create Discount    --->   Status Code should be "201"
Create Discount Negative Test   ---->   Status Code should be "400"
Edit Created Discount (Edit description)    --->   Status Code should be "200"
Delete Created Discount    --->   Status Code should be "200"
Delete Created Discount Negative Test    --->   Status Code should be "404"

Inside body, you need to provide:
code: (Code is up to you)
description: ( Description is up to you)
priority: ( Priority should be number )
active: (true)


--- PART 2 ---

Create - Edit - Delete Notification

Api Path: "/school-service/api/notifications"

Create Notification**    --->   Status Code should be "201"
Create Notification Negative Test   ---->   Status Code should be "400"
Edit Created Notification (Edit name and short name)    --->   Status Code should be "200"
Delete Created Notification    --->   Status Code should be "200"
Delete Created Notification Negative Test    --->   Status Code should be "404"

**Inside body, you need to provide:
name: (Name is up to you)
description: ( description is up to you)
type: ( "STUDENT_PAYMENT_TIME" )
schoolId: (" 5c5aa8551ad17423a4f6ef1d ")


--- Part 3 ---

Create - Edit - Delete Document Type

Api Path: "/school-service/api/attachments"

Create Document Type**    --->   Status Code should be "201"
Create Document Type Negative Test   ---->   Status Code should be "400"
Edit Created Document Type (Edit name and Description)    --->   Status Code should be "200"
Delete Created Discount    --->   Status Code should be "200"
Delete Created Discount Negative Test    --->   Status Code should be "404"

**Inside body, you need to provide:
name: (Name is up to you)
description: ( Description is up to you)
schoolId: ( "5c5aa8551ad17423a4f6ef1d" )
active: ( true )
required: ( true )
attachmentStages: ( "EXAMINATION" , "EMPLOYMENT" , "CERTIFICATE" )
 */
