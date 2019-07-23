import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.sehatq.com/obat/acarbose')

WebUI.waitForPageLoad(30)

int i = 1

def b = ['https://dev.sehatq.com/public/css/bootstrap.mod.css?ts=1552451465', 'https://dev.sehatq.com/public/vendor/slick/slick.css?ts=1552451465'
    , 'https://dev.sehatq.com/public/vendor/fontawesome/css/all.mod.css?ts=1552451465', 'https://dev.sehatq.com/public/materialPro/assets/plugins/sweetalert/sweetalert.css'
    , 'https://dev.sehatq.com/public/vendor/bootstrap4-datetimepicker-master/build/css/bootstrap-datetimepicker.min.css'
    , 'https://dev.sehatq.com/public/css/select2.min.css', 'https://dev.sehatq.com/public/css/select2-bootstrap.min.css'
    , 'https://dev.sehatq.com/public/vendor/jScrollPane/style/jquery.jscrollpane.css', 'https://dev.sehatq.com/public/vendor/ion.rangeSlider-2.2.0/css/ion.rangeSlider.css'
    , 'https://dev.sehatq.com/public/vendor/ion.rangeSlider-2.2.0/css/ion.rangeSlider.skinModern.css', 'https://dev.sehatq.com/public/css/style.css?ts=1552451465'
    , 'https://dev.sehatq.com/public/css/responsive.css?ts=1552451465', 'https://dev.sehatq.com/public/img/logo-icon.svg'
    , 'https://dev.sehatq.com/public/img/login-male.svg', 'https://dev.sehatq.com/public/img/login-female.svg', 'https://dev.sehatq.com/'
    , 'https://dev.sehatq.com/public/img/logo.png', 'https://dev.sehatq.com/public/ico_custom/ico_cari.svg', 'https://dev.sehatq.com/public/ico_custom/user_setting.svg'
    , 'https://dev.sehatq.com/penyakit', 'https://dev.sehatq.com/obat', 'https://dev.sehatq.com/artikel', 'https://dev.sehatq.com/dokter'
    , 'https://dev.sehatq.com/rumah-sakit', 'https://dev.sehatq.com/forum', 'https://dev.sehatq.com/asuransi/login', 'https://dev.sehatq.com/obat/A'
    , 'https://dev.sehatq.com/obat/B', 'https://dev.sehatq.com/obat/C', 'https://dev.sehatq.com/obat/D', 'https://dev.sehatq.com/obat/E'
    , 'https://dev.sehatq.com/obat/F', 'https://dev.sehatq.com/obat/G', 'https://dev.sehatq.com/obat/H', 'https://dev.sehatq.com/obat/I'
    , 'https://dev.sehatq.com/obat/J', 'https://dev.sehatq.com/obat/K', 'https://dev.sehatq.com/obat/L', 'https://dev.sehatq.com/obat/M'
    , 'https://dev.sehatq.com/obat/N', 'https://dev.sehatq.com/obat/O', 'https://dev.sehatq.com/obat/P', 'https://dev.sehatq.com/obat/Q'
    , 'https://dev.sehatq.com/obat/R', 'https://dev.sehatq.com/obat/S', 'https://dev.sehatq.com/obat/T', 'https://dev.sehatq.com/obat/U'
    , 'https://dev.sehatq.com/obat/V', 'https://dev.sehatq.com/obat/W', 'https://dev.sehatq.com/obat/X', 'https://dev.sehatq.com/obat/Y'
    , 'https://dev.sehatq.com/obat/Z', 'https://dev.sehatq.com/syarat', 'https://dev.sehatq.com/public/js/jquery-3.3.1.min.js'
    , 'https://dev.sehatq.com/public/js/popper.min.js', 'https://dev.sehatq.com/public/js/bootstrap.min.js', 'https://dev.sehatq.com/public/js/jquery.validate.min.js'
    , 'https://dev.sehatq.com/public/js/additional-methods.min.js', 'https://dev.sehatq.com/public/js/draggabilly.pkgd.min.js'
    , 'https://dev.sehatq.com/public/js/packery.pkgd.min.js', 'https://dev.sehatq.com/public/materialPro/assets/plugins/sweetalert/sweetalert.min.js'
    , 'https://dev.sehatq.com/public/materialPro/assets/plugins/sweetalert/jQuery.sweet-alert.custom.js', 'https://dev.sehatq.com/public/js/moment.min.js'
    , 'https://dev.sehatq.com/public/js/id.js', 'https://dev.sehatq.com/public/vendor/bootstrap4-datetimepicker-master/build/js/bootstrap-datetimepicker.min.js'
    , 'https://dev.sehatq.com/public/js/select2.min.js', 'https://dev.sehatq.com/public/vendor/slick/slick.min.js', 'https://dev.sehatq.com/public/js/jquery.slimscroll.min.js'
    , 'https://dev.sehatq.com/public/vendor/jScrollPane/script/jquery.mousewheel.js', 'https://dev.sehatq.com/public/vendor/jScrollPane/script/mwheelIntent.js'
    , 'https://dev.sehatq.com/public/vendor/jScrollPane/script/jquery.jscrollpane.min.js', 'https://dev.sehatq.com/public/vendor/ion.rangeSlider-2.2.0/js/ion-rangeSlider/ion.rangeSlider.min.js'
    , 'https://dev.sehatq.com/public/js/app.front.js?ts=1552451465']

while (WebUI.verifyElementPresent(findTestObject('obat/Page_Vitamin B9  Fungsi cara pemaka/a_Obat Selanjutnya'), 30, 
    FailureHandling.OPTIONAL) == true) {
    def uerel = []

    uerel += WebUI.getAllLinksOnCurrentPage(false, b)

    for (int x = 1; x < uerel.size; x++) {
        def z = []

        z += (uerel[x])

        if (WebUI.verifyLinksAccessible(z, FailureHandling.OPTIONAL) == true) {
        } else {
            CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('obat', i, 1, WebUI.getUrl())

            CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('obat', i, 2, uerel[x])

            i++
        }
    }
    
    WebUI.click(findTestObject('obat/Page_Vitamin B9  Fungsi cara pemaka/a_Obat Selanjutnya'))

    WebUI.waitForPageLoad(30)
}

if (WebUI.verifyAllLinksOnCurrentPageAccessible(false, b, FailureHandling.CONTINUE_ON_FAILURE) == true) {
} else {
    WebUI.comment(WebUI.getUrl())
}

WebUI.closeBrowser()

