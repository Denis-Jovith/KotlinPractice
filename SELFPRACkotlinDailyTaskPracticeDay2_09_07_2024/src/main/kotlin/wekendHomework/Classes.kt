package wekendHomework

data class Service(val name:String, val description:String, val price: Int)
data class Education (val classLevel:String, val schoolName:String, val yearOfCompletion:String)
data class Achievement(val name:String, val yearOfAchievement: String)
data class Project(val name:String, val description: String,val technologies:String,val role:String)
data class Contact(val name:String,val contacti :String )
data class SocialMediaLinks(val name:String, val link :String)