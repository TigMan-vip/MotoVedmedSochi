package ru.shiftlab.cftteam.navigation.di

import org.koin.dsl.module
import ru.shiftlab.cftteam.dynamicfeatures.escorts.escortdetail.presentation.EscortDetailRouter
import ru.shiftlab.cftteam.dynamicfeatures.escorts.escortrefuse.presentation.EscortRefuseRouter
import ru.shiftlab.cftteam.features.aboutcompany.details.presentation.AboutCompanyDetailsRouter
import ru.shiftlab.cftteam.features.aboutcompany.list.presentation.AboutCompanyListRouter
import ru.shiftlab.cftteam.features.employment.landing.presentation.EmploymentLandingRouter
import ru.shiftlab.cftteam.features.employment.main.presentation.EmploymentMainRouter
import ru.shiftlab.cftteam.features.events.eventdetail.presentation.EventDetailRouter
import ru.shiftlab.cftteam.features.events.eventrefuse.presentation.EventRefuseRouter
import ru.shiftlab.cftteam.features.events.eventresponse.presentation.EventResponseRouter
import ru.shiftlab.cftteam.features.events.homeevents.presentation.HomeEventsRouter
import ru.shiftlab.cftteam.features.filters.presentation.FiltersRouter
import ru.shiftlab.cftteam.features.home.aboutcompany.presentation.HomeAboutCompanyRouter
import ru.shiftlab.cftteam.features.home.hotvacancies.presentation.HotVacanciesRouter
import ru.shiftlab.cftteam.features.home.mainhome.presentation.HomeRouter
import ru.shiftlab.cftteam.features.home.nearestevents.presentation.NearestEventsRouter
import ru.shiftlab.cftteam.features.home.userescorts.presentation.HomeUserEscortsRouter
import ru.shiftlab.cftteam.features.home.userevents.presentation.UserEventsRouter
import ru.shiftlab.cftteam.features.main.presentation.MainFragmentRouter
import ru.shiftlab.cftteam.features.notifications.presentation.NotificationsRouter
import ru.shiftlab.cftteam.features.search.globalsearch.presentation.GlobalSearchRouter
import ru.shiftlab.cftteam.features.search.searchvacancies.presentation.SearchVacanciesRouter
import ru.shiftlab.cftteam.features.settings.presentation.SettingsRouter
import ru.shiftlab.cftteam.features.splash.presentation.SplashRouter
import ru.shiftlab.cftteam.features.user.edit.cropper.presentation.CropperRouter
import ru.shiftlab.cftteam.features.user.edit.email.presentation.EditEmailRouter
import ru.shiftlab.cftteam.features.user.edit.password.presentation.EditPasswordRouter
import ru.shiftlab.cftteam.features.user.edit.phone.otp.presentation.PhoneOTPRouter
import ru.shiftlab.cftteam.features.user.edit.phone.phone.presentation.EditPhoneRouter
import ru.shiftlab.cftteam.features.user.edit.profileinfo.presentation.EditProfileRouter
import ru.shiftlab.cftteam.features.user.firststart.presentation.FirstStartRouter
import ru.shiftlab.cftteam.features.user.loginselection.presentation.LoginSelectionRouter
import ru.shiftlab.cftteam.features.user.qr.resending.presentation.QRResendingRouter
import ru.shiftlab.cftteam.features.user.qr.scanner.presentation.QRScannerRouter
import ru.shiftlab.cftteam.features.user.restore.presentation.RestoreRouter
import ru.shiftlab.cftteam.features.user.signin.presentation.SignInRouter
import ru.shiftlab.cftteam.features.user.signup.presentation.SignUpRouter
import ru.shiftlab.cftteam.features.user.userscreen.presentation.UserScreenRouter
import ru.shiftlab.cftteam.features.vacancies.homevacancies.presentation.HomeVacanciesRouter
import ru.shiftlab.cftteam.features.vacancies.vacancydetail.presentation.DetailVacancyRouter
import ru.shiftlab.cftteam.features.vacancies.vacancylist.presentation.VacancyListRouter
import ru.shiftlab.cftteam.features.vacancies.vacancyresponse.presentation.VacancyResponseRouter
import ru.shiftlab.cftteam.features.welcome.presentation.WelcomeRouter
import ru.shiftlab.cftteam.navigation.AboutCompanyDetailsRouterImpl
import ru.shiftlab.cftteam.navigation.AboutCompanyListRouterImpl
import ru.shiftlab.cftteam.navigation.CropperRouterImpl
import ru.shiftlab.cftteam.navigation.DetailVacancyRouterImpl
import ru.shiftlab.cftteam.navigation.EditEmailRouterImpl
import ru.shiftlab.cftteam.navigation.EditInterestsRouterImpl
import ru.shiftlab.cftteam.navigation.EditPasswordRouterImpl
import ru.shiftlab.cftteam.navigation.EditPhoneRouterImpl
import ru.shiftlab.cftteam.navigation.EditProfileEmbedRouterImpl
import ru.shiftlab.cftteam.navigation.EditProfileRouterImpl
import ru.shiftlab.cftteam.navigation.EmploymentLandingRouterImpl
import ru.shiftlab.cftteam.navigation.EmploymentMainRouterImpl
import ru.shiftlab.cftteam.navigation.EscortDetailRouterImpl
import ru.shiftlab.cftteam.navigation.EscortRefuseRouterImpl
import ru.shiftlab.cftteam.navigation.EventDetailRouterImpl
import ru.shiftlab.cftteam.navigation.EventRefuseRouterImpl
import ru.shiftlab.cftteam.navigation.EventResponseRouterImpl
import ru.shiftlab.cftteam.navigation.FiltersRouterImpl
import ru.shiftlab.cftteam.navigation.FirstStartRouterImpl
import ru.shiftlab.cftteam.navigation.GlobalSearchRouterImpl
import ru.shiftlab.cftteam.navigation.HomeAboutCompanyRouterImpl
import ru.shiftlab.cftteam.navigation.HomeEmploymentRouterImpl
import ru.shiftlab.cftteam.navigation.HomeEventsRouterImpl
import ru.shiftlab.cftteam.navigation.HomeRouterImpl
import ru.shiftlab.cftteam.navigation.HomeUserEscortsRouterImpl
import ru.shiftlab.cftteam.navigation.HomeVacanciesRouterImpl
import ru.shiftlab.cftteam.navigation.HotVacanciesRouterImpl
import ru.shiftlab.cftteam.navigation.LoginSelectionRouterImpl
import ru.shiftlab.cftteam.navigation.MainActivityRouterImpl
import ru.shiftlab.cftteam.navigation.MainFragmentRouterImpl
import ru.shiftlab.cftteam.navigation.NearestEventsRouterImpl
import ru.shiftlab.cftteam.navigation.NotificationsRouterImpl
import ru.shiftlab.cftteam.navigation.PhoneOTPRouterImpl
import ru.shiftlab.cftteam.navigation.QRResendingRouterImpl
import ru.shiftlab.cftteam.navigation.QRScannerRouterImpl
import ru.shiftlab.cftteam.navigation.RestoreRouterImp
import ru.shiftlab.cftteam.navigation.SearchVacanciesRouterImpl
import ru.shiftlab.cftteam.navigation.SettingsRouterImpl
import ru.shiftlab.cftteam.navigation.SignInRouterImpl
import ru.shiftlab.cftteam.navigation.SignUpRouterImpl
import ru.shiftlab.cftteam.navigation.SplashRouterImpl
import ru.shiftlab.cftteam.navigation.UserEventsRouterImpl
import ru.shiftlab.cftteam.navigation.UserScreenRouterImpl
import ru.shiftlab.cftteam.navigation.VacancyListRouterImpl
import ru.shiftlab.cftteam.navigation.VacancyResponseRouterImpl
import ru.shiftlab.cftteam.navigation.WelcomeRouterImpl
import ru.shiftlab.cftteam.presentation.MainActivityRouter
import ru.shiftlab.cftteam.shared.user.edit.uicomponent.presentation.EditProfileEmbedRouter
import ru.shiftlab.features.home.employment.presentation.HomeEmploymentRouter
import ru.shiftlab.features.user.edit.interests.presentation.EditInterestsRouter

val RouterModule = module {
	factory<MainFragmentRouter> { MainFragmentRouterImpl(get()) }
	factory<UserEventsRouter> { UserEventsRouterImpl(get(), get()) }
	factory<NearestEventsRouter> { NearestEventsRouterImpl(get(), get()) }
	factory<HotVacanciesRouter> { HotVacanciesRouterImpl(get(), get()) }

	factory<MainActivityRouter> { MainActivityRouterImpl(get(), get()) }
	factory<EditProfileRouter> { EditProfileRouterImpl(get()) }
	factory<SignInRouter> { SignInRouterImpl(get()) }
	factory<SplashRouter> { SplashRouterImpl(get()) }
	factory<SettingsRouter> { SettingsRouterImpl(get()) }
	factory<DetailVacancyRouter> { DetailVacancyRouterImpl(get()) }
	factory<EmploymentMainRouter> { EmploymentMainRouterImpl(get()) }
	factory<RestoreRouter> { RestoreRouterImp(get()) }
	factory<EditInterestsRouter> { EditInterestsRouterImpl(get()) }
	factory<EscortDetailRouter> { EscortDetailRouterImpl(get()) }
	factory<EscortRefuseRouter> { EscortRefuseRouterImpl(get()) }
	factory<EditPhoneRouter> { EditPhoneRouterImpl(get()) }
	factory<EditPasswordRouter> { EditPasswordRouterImpl(get()) }
	factory<CropperRouter> { CropperRouterImpl(get()) }
	factory<WelcomeRouter> { WelcomeRouterImpl(get()) }
	factory<VacancyResponseRouter> { VacancyResponseRouterImpl(get()) }
	factory<FirstStartRouter> { FirstStartRouterImpl(get()) }
	factory<QRResendingRouter> { QRResendingRouterImpl(get()) }
	factory<EventRefuseRouter> { EventRefuseRouterImpl(get()) }
	factory<AboutCompanyDetailsRouter> { AboutCompanyDetailsRouterImpl(get()) }
	factory<QRScannerRouter> { QRScannerRouterImpl(get()) }
	factory<EventDetailRouter> { EventDetailRouterImpl(get()) }
	factory<VacancyListRouter> { VacancyListRouterImpl(get()) }
	factory<EditEmailRouter> { EditEmailRouterImpl(get()) }
	factory<HomeRouter> { HomeRouterImpl(get()) }
	factory<HomeAboutCompanyRouter> { HomeAboutCompanyRouterImpl(get()) }
	factory<AboutCompanyListRouter> { AboutCompanyListRouterImpl(get()) }
	factory<HomeEmploymentRouter> { HomeEmploymentRouterImpl(get()) }
	factory<HomeUserEscortsRouter> { HomeUserEscortsRouterImpl(get()) }
	factory<EventResponseRouter> { EventResponseRouterImpl(get()) }
	factory<NotificationsRouter> { NotificationsRouterImpl(get()) }
	factory<FiltersRouter> { FiltersRouterImpl(get()) }
	factory<GlobalSearchRouter> { GlobalSearchRouterImpl(get()) }
	factory<HomeVacanciesRouter> { HomeVacanciesRouterImpl(get()) }
	factory<HomeEventsRouter> { HomeEventsRouterImpl(get()) }
	factory<SignUpRouter> { SignUpRouterImpl(get()) }
	factory<UserScreenRouter> { UserScreenRouterImpl(get()) }
	factory<LoginSelectionRouter> { LoginSelectionRouterImpl(get()) }
	factory<EmploymentLandingRouter> { EmploymentLandingRouterImpl(get()) }
	factory<EditProfileEmbedRouter> { EditProfileEmbedRouterImpl(get()) }
	factory<SearchVacanciesRouter> { SearchVacanciesRouterImpl(get()) }
	factory<PhoneOTPRouter> { PhoneOTPRouterImpl(get()) }
}