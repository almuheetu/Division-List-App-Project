package com.example.myapplication

val divisionList = arrayListOf(
    Division(divisionName = "Dhaka"),
    Division(divisionName = "Chattogram"),
    Division(divisionName = "Rajshahi"),
    Division(divisionName = "Khulna"),
    Division(divisionName = "Barisal"),
    Division(divisionName = "Sylhet"),
    Division(divisionName = "Rangpur"),
    Division(divisionName = "Mymensingh")

)


val districtList = arrayListOf(
    District(divisionName = "Dhaka", districtName = "Dhaka"),
    District(divisionName = "Dhaka", districtName = "Narayanganj"),
    District(divisionName = "Dhaka", districtName = "Gazipur"),
    District(divisionName = "Chattogram", districtName = "Cumilla"),
    District(divisionName = "Chattogram", districtName = "Feni"),
    District(divisionName = "Chattogram", districtName = "Brahmanbaria"),
    District(divisionName = "Rajshahi", districtName = "Natore"),
    District(divisionName = "Rajshahi", districtName = "Bogura"),
    District(divisionName = "Rajshahi", districtName = "Naogaon"),
    District(divisionName = "Khulna", districtName = "Bagerhat"),
    District(divisionName = "Khulna", districtName = "Chuadanga"),
    District(divisionName = "Khulna", districtName = "Jessore"),
    District(divisionName = "Barisal", districtName = "Barguna"),
    District(divisionName = "Barisal", districtName = "Barishal"),
    District(divisionName = "Barisal", districtName = "Bhola"),
    District(divisionName = "Sylhet", districtName = "Sunamganj"),
    District(divisionName = "Sylhet", districtName = "Sylhet"),
    District(divisionName = "Sylhet", districtName = "Moulvibazar"),
    District(divisionName = "Rangpur", districtName = "Dinajpur"),
    District(divisionName = "Rangpur", districtName = "Gaibandha"),
    District(divisionName = "Rangpur", districtName = "Kurigram"),
    District(divisionName = "Mymensingh", districtName = "Sherpur"),
    District(divisionName = "Mymensingh", districtName = "Jamalpur"),
    District(divisionName = "Mymensingh", districtName = "Netrokona")

)

val thanaList = arrayListOf(
    Thana(districtName = "Dhaka", thanaName = "Mohammadpur"),
    Thana(districtName = "Dhaka", thanaName = "Uttara"),
    Thana(districtName = "Dhaka", thanaName = "Ramna"),

    Thana(districtName = "Narayanganj", thanaName = "Narayanganj Sadar "),
    Thana(districtName = "Narayanganj", thanaName = "Fatulla"),
    Thana(districtName = "Narayanganj", thanaName = "Sinamangal"),

    Thana(districtName = "Gazipur", thanaName = "Gazipur Sadar"),
    Thana(districtName = "Gazipur", thanaName = "Kaliakior"),
    Thana(districtName = "Gazipur", thanaName = "Tongi"),

    Thana(districtName = "Cumilla", thanaName = "Cumilla Sadar"),
    Thana(districtName = "Cumilla", thanaName = "Brahmanpara"),
    Thana(districtName = "Cumilla", thanaName = "Debidwar"),

    Thana(districtName = "Feni", thanaName = "Feni Sadar "),
    Thana(districtName = "Feni", thanaName = "Daganbhuiyan"),
    Thana(districtName = "Feni", thanaName = "Fulgazi"),

    Thana(districtName = "Brahmanbaria", thanaName = "Brahmanbaria Sadar"),
    Thana(districtName = "Brahmanbaria", thanaName = "Bijoynagar"),
    Thana(districtName = "Brahmanbaria", thanaName = "Nabinagar"),

    Thana(districtName = "Natore", thanaName = "Natore Sadar"),
    Thana(districtName = "Natore", thanaName = "Bagatipara"),
    Thana(districtName = "Natore", thanaName = "Lalpur"),

    Thana(districtName = "Bogura", thanaName = "Bogura Sadar"),
    Thana(districtName = "Bogura", thanaName = "Kahaloo"),
    Thana(districtName = "Bogura", thanaName = "Sherpur"),

    Thana(districtName = "Naogaon", thanaName = "Naogaon Sadar "),
    Thana(districtName = "Naogaon", thanaName = "Porsha"),
    Thana(districtName = "Naogaon", thanaName = "Mohadevpur"),

    Thana(districtName = "Bagerhat", thanaName = "Bagerhat Sadar"),
    Thana(districtName = "Bagerhat", thanaName = "Mollahat"),
    Thana(districtName = "Bagerhat", thanaName = "Chitalmari"),

    Thana(districtName = "Chuadanga", thanaName = "Chuadanga Sadar"),
    Thana(districtName = "Chuadanga", thanaName = "Damurhuda"),
    Thana(districtName = "Chuadanga", thanaName = "Jibonnagar"),

    Thana(districtName = "Jessore", thanaName = "Jessore Sadar"),
    Thana(districtName = "Jessore", thanaName = "Abhaynagar"),
    Thana(districtName = "Jessore", thanaName = "Keshabpur"),

    Thana(districtName = "Barguna", thanaName = "Barguna Sadar "),
    Thana(districtName = "Barguna", thanaName = "Amtali"),
    Thana(districtName = "Barguna", thanaName = "Patharghata"),

    Thana(districtName = "Barishal", thanaName = "Barishal Sadar"),
    Thana(districtName = "Barishal", thanaName = "Wazirpur"),
    Thana(districtName = "Barishal", thanaName = "Banaripara"),

    Thana(districtName = "Bhola", thanaName = "Bhola Sadar"),
    Thana(districtName = "Bhola", thanaName = "Lalmohan"),
    Thana(districtName = "Bhola", thanaName = "Tazumuddin"),

    Thana(districtName = "Sunamganj", thanaName = "Sunamganj Sadar "),
    Thana(districtName = "Sunamganj", thanaName = "Biswambharpur"),
    Thana(districtName = "Sunamganj", thanaName = "Jamaica"),

    Thana(districtName = "Sylhet", thanaName = "Sylhet Sadar "),
    Thana(districtName = "Sylhet", thanaName = "Jaintiapur"),
    Thana(districtName = "Sylhet", thanaName = "Companiganj"),

    Thana(districtName = "Moulvibazar", thanaName = "Moulvibazar Sadar "),
    Thana(districtName = "Moulvibazar", thanaName = "Kamalganj"),
    Thana(districtName = "Moulvibazar", thanaName = "Rajnagar"),

    Thana(districtName = "Dinajpur", thanaName = "Dinajpur Sadar"),
    Thana(districtName = "Dinajpur", thanaName = "Biral"),
    Thana(districtName = "Dinajpur", thanaName = "Kaharol"),

    Thana(districtName = "Gaibandha", thanaName = "Gaibandha Sadar"),
    Thana(districtName = "Gaibandha", thanaName = "Gobindaganj"),
    Thana(districtName = "Gaibandha", thanaName = "Sundarganj"),

    Thana(districtName = "Kurigram", thanaName = "Kurigram Sadar"),
    Thana(districtName = "Kurigram", thanaName = "Bhurgari"),
    Thana(districtName = "Kurigram", thanaName = "Nageshwari"),

    Thana(districtName = "Sherpur", thanaName = "Sherpur Sadar "),
    Thana(districtName = "Sherpur", thanaName = "Nakla"),
    Thana(districtName = "Sherpur", thanaName = "Jhenaigati"),

    Thana(districtName = "Jamalpur", thanaName = "Jamalpur Sadar"),
    Thana(districtName = "Jamalpur", thanaName = "Melandah"),
    Thana(districtName = "Jamalpur", thanaName = "Islampur"),

    Thana(districtName = "Netrokona", thanaName = "Netrokona Sadar"),
    Thana(districtName = "Netrokona", thanaName = "Khaliajuri"),
    Thana(districtName = "Netrokona", thanaName = "Barhatta")

    )