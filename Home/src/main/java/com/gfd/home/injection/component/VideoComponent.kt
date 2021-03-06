package com.gfd.home.injection.component

import com.gfd.common.injection.component.ActivityComponent
import com.gfd.common.injection.scope.PerComponentScope
import com.gfd.home.injection.module.VideoModule
import com.gfd.home.ui.fragment.HomeFragment
import dagger.Component

/**
 * @Author : 郭富东
 * @Date ：2018/8/3 - 10:38
 * @Email：878749089@qq.com
 * @description：Dagger2-Component
 */
@PerComponentScope
@Component(modules = [VideoModule::class],dependencies = [ActivityComponent::class])
interface VideoComponent{
    fun inject(fragment: HomeFragment)
}