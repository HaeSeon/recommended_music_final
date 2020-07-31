package com.example.music_recomend_profile.database

import com.example.music_recomend_profile.R


//임시 데이터 생성
class DataExample {
    companion object {
        var myProfile: UserProfile = UserProfile(
            "해써니사이드오브", "gildogi@naver.com",
            R.drawable.profile_haesun,
            999,
            150,
            "배고파 치킨사줘", 24, "female", 830919601000
        )
    }

    fun updateMyProfile(profile: UserProfile) {
        myProfile = profile
    }

    fun getUser(): UserProfile {
        val profile = UserProfile(
            myProfile.name,
            myProfile.email,
            myProfile.image,
            myProfile.follower,
            myProfile.following,
            myProfile.introduce,
            myProfile.age,
            myProfile.sex,
            myProfile.birthday
        )
        return profile
    }

    fun createRecordItem(): ArrayList<RecordItem> {
        val recordItemList: ArrayList<RecordItem> = ArrayList()

        //아래는 예시
        //데이터베이스에서 RecordItem 받아와서 날짜순으로 정렬해야함.
        recordItemList.add(
            RecordItem(
                "설레",
                191224
            )
        )
        recordItemList.add(
            RecordItem(
                "즐거워",
                191231
            )
        )
        recordItemList.add(
            RecordItem(
                "슬퍼",
                200408
            )
        )
        recordItemList.add(
            RecordItem(
                "그냥그래",
                200701
            )
        )
        recordItemList.add(
            RecordItem(
                "기뻐",
                200705
            )
        )
        recordItemList.add(
            RecordItem(
                "화나",
                2007010
            )
        )
        recordItemList.add(
            RecordItem(
                "화나",
                2007015
            )
        )

        return recordItemList

    }
}