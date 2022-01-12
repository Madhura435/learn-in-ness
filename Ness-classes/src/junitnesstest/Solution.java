package junitnesstest;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	
	
	
	
//	private ResponseEntity<Object> checkForNulls(LocationType locationType) {
//	
//	 List<String> errorList = new ArrayList<>();
//     String domainName = locationType.getLocationGid().getGid().getDomainName();
//     Map<Integer,Boolean> y=new LinkedHashMap<Integer,Boolean>();
//     y.put(1,!domainName.equalsIgnoreCase("CTC"));
//      y.put(2,ObjectUtils.isEmpty(locationType.getLocationGid().getGid().getXid()));
//     y.put(3,ObjectUtils.isEmpty(locationType.getLocationName()));
//   
//     for (AddressLinesType eachAddressLine : locationType.getAddress().getAddressLines()) {
//         String seqno = eachAddressLine.getSequenceNumber();
//         if (seqno.equals("1") && ObjectUtils.isEmpty(eachAddressLine.getAddressLine())) {
//             errorList.add("Address line1 cannot be empty");
//         }
//     }
//     y.put(4,ObjectUtils.isEmpty(locationType.getAddress().getCity()));
//    y.put(5,ObjectUtils.isEmpty(locationType.getAddress().getCountryCode3Gid().getGid().getXid()));
//     y.put(6,ObjectUtils.isEmpty(locationType.getAddress().getPostalCode()));
//  y.put(7,ObjectUtils.isEmpty(locationType.getAddress().getProvinceCode()));
//     int i = 1;
//     for (ContactType eachContact : locationType.getContact()) {
//         if (ObjectUtils.isEmpty(eachContact.getIsPrimaryContact())) {
//             errorList.add("Primary contact at index " + i + " is not provided");
//         }
//         if (ObjectUtils.isEmpty(eachContact.getExternalSystemGid().getGid().getXid())) {
//             errorList.add("Contact id at index " + i + " is mandatory field");
//         }
//         i++;
//     }
//     y.put(8,ObjectUtils.isEmpty(locationType.getServiceProvider().getScacGid().getGid().getXid()));
//     y.put(9,ObjectUtils.isEmpty(locationType.getIsActive()));
//     addressnull(y);
//     i = 1;
//     for (LocationRefnumType eachRef : locationType.getLocationRefnum()) {
//         if (ObjectUtils.isEmpty(eachRef.getLocationRefnumValue())) {
//             errorList.add("LocationRefnumValue at index " + i + " is empty");
//         }
//         i++;
//     }
//     return ResponseEntity.badRequest().body(errorList);
//	}
//public void addressnull(LinkedHashMap<Integer,Boolean> e)
//{
//	for(Map.Entry<Integer,Boolean> x:e.entrySet())
//	 {
//		Boolean d=x.getValue();
//		if(d==true)
//		{
//		Integer z=x.getKey();
//		 switch(z)
//		 {
//		 case 1:
//			 errorList.add("The domainName " + domainName + " is currently not supported. " +
//	                 "Supported domains: CTC");
//			 break;
//		 case 2:
//			 errorList.add("CarrierId cannot be empty");
//			 break;
//		 case 3:
//			 errorList.add("CarrierName cannot be empty");
//			 break;
//		 case 4:
//			 errorList.add("City cannot be empty");
//			 break;
//		 case 5:
//			 errorList.add("Country code cannot be empty");
//			 break;
//		 case 6:
//			 errorList.add("Postal code cannot be empty");
//			 break;
//		 case 7:
//			 errorList.add("Province code cannot be empty");
//			 break;
//		 case 8:
//			 errorList.add("SCAC cannot be empty");
//			 break;
//		 case 9:
//			 errorList.add("IsActive flag cannot be empty");
//			 break;
//		 }
//		}
//	 }
//
// 
//}
}

