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

WebUI.navigateToUrl('https://dev.sehatq.com/penyakit/ablasi-retina')

WebUI.waitForPageLoad(30)

int i = 1

def b = ['https://dev.sehatq.com/public/favicon.ico', 'https://dev.sehatq.com/public/css/bootstrap.mod.css?ts=1552457182'
    , 'https://dev.sehatq.com/public/vendor/slick/slick.css?ts=1552457182', 'https://dev.sehatq.com/public/vendor/fontawesome/css/all.mod.css?ts=1552457182'
    , 'https://dev.sehatq.com/public/materialPro/assets/plugins/sweetalert/sweetalert.css', 'https://dev.sehatq.com/public/vendor/bootstrap4-datetimepicker-master/build/css/bootstrap-datetimepicker.min.css'
    , 'https://dev.sehatq.com/public/css/select2.min.css', 'https://dev.sehatq.com/public/css/select2-bootstrap.min.css'
    , 'https://dev.sehatq.com/public/vendor/jScrollPane/style/jquery.jscrollpane.css', 'https://dev.sehatq.com/public/vendor/ion.rangeSlider-2.2.0/css/ion.rangeSlider.css'
    , 'https://dev.sehatq.com/public/vendor/ion.rangeSlider-2.2.0/css/ion.rangeSlider.skinModern.css', 'https://dev.sehatq.com/public/css/style.css?ts=1552457182'
    , 'https://dev.sehatq.com/public/css/responsive.css?ts=1552457182', 'https://dev.sehatq.com/public/img/logo-icon.svg'
    , 'https://dev.sehatq.com/public/img/login-male.svg', 'https://dev.sehatq.com/public/img/login-female.svg', 'https://dev.sehatq.com/'
    , 'https://dev.sehatq.com/public/img/logo.png', 'https://dev.sehatq.com/public/ico_custom/ico_cari.svg', 'https://dev.sehatq.com/public/ico_custom/user_setting.svg'
    , 'https://dev.sehatq.com/penyakit', 'https://dev.sehatq.com/obat', 'https://dev.sehatq.com/artikel', 'https://dev.sehatq.com/dokter'
    , 'https://dev.sehatq.com/rumah-sakit', 'https://dev.sehatq.com/forum', 'https://dev.sehatq.com/asuransi/login', 'https://dev.sehatq.com/penyakit/A'
    , 'https://dev.sehatq.com/penyakit/B', 'https://dev.sehatq.com/penyakit/C', 'https://dev.sehatq.com/penyakit/D', 'https://dev.sehatq.com/penyakit/E'
    , 'https://dev.sehatq.com/penyakit/F', 'https://dev.sehatq.com/penyakit/G', 'https://dev.sehatq.com/penyakit/H', 'https://dev.sehatq.com/penyakit/I'
    , 'https://dev.sehatq.com/penyakit/J', 'https://dev.sehatq.com/penyakit/K', 'https://dev.sehatq.com/penyakit/L', 'https://dev.sehatq.com/penyakit/M'
    , 'https://dev.sehatq.com/penyakit/N', 'https://dev.sehatq.com/penyakit/O', 'https://dev.sehatq.com/penyakit/P', 'https://dev.sehatq.com/penyakit/Q'
    , 'https://dev.sehatq.com/penyakit/R', 'https://dev.sehatq.com/penyakit/S', 'https://dev.sehatq.com/penyakit/T', 'https://dev.sehatq.com/penyakit/U'
    , 'https://dev.sehatq.com/penyakit/V', 'https://dev.sehatq.com/penyakit/W', 'https://dev.sehatq.com/penyakit/X', 'https://dev.sehatq.com/penyakit/Y'
    , 'https://dev.sehatq.com/penyakit/Z', 'https://dev.sehatq.com/public/ico_custom/v2/semua_penyakit.svg', 'https://dev.sehatq.com/penyakit/kepala'
    , 'https://dev.sehatq.com/public/ico_custom/kepala-1551667070.svg', 'https://dev.sehatq.com/penyakit/mata', 'https://dev.sehatq.com/public/ico_custom/mata-1551667406.svg'
    , 'https://dev.sehatq.com/penyakit/infeksi', 'https://dev.sehatq.com/public/ico_custom/infeksi-1551667521.svg', 'https://dev.sehatq.com/penyakit/kulit-kelamin'
    , 'https://dev.sehatq.com/public/ico_custom/kulit-kelamin-1551667604.svg', 'https://dev.sehatq.com/penyakit/kanker', 'https://dev.sehatq.com/public/ico_custom/kanker-1551667714.svg'
    , 'https://dev.sehatq.com/penyakit/jantung', 'https://dev.sehatq.com/public/ico_custom/1548676124.svg', 'https://dev.sehatq.com/penyakit/pernapasan'
    , 'https://dev.sehatq.com/public/ico_custom/pernapasan-1551668144.svg', 'https://dev.sehatq.com/penyakit/perut', 'https://dev.sehatq.com/public/ico_custom/perut-1551668237.svg'
    , 'https://dev.sehatq.com/penyakit/kandungan', 'https://dev.sehatq.com/public/ico_custom/kandungan-1551668345.svg', 'https://dev.sehatq.com/penyakit/psikologi'
    , 'https://dev.sehatq.com/public/ico_custom/1548676203.svg', 'https://dev.sehatq.com/penyakit/semua-penyakit', 'https://dev.sehatq.com/public/ico_custom/semua-penyakit-1551668739.svg'
    , 'https://dev.sehatq.com/syarat', 'https://dev.sehatq.com/public/js/jquery-3.3.1.min.js', 'https://dev.sehatq.com/public/js/popper.min.js'
    , 'https://dev.sehatq.com/public/js/bootstrap.min.js', 'https://dev.sehatq.com/public/js/jquery.validate.min.js', 'https://dev.sehatq.com/public/js/additional-methods.min.js'
    , 'https://dev.sehatq.com/public/js/draggabilly.pkgd.min.js', 'https://dev.sehatq.com/public/js/packery.pkgd.min.js'
    , 'https://dev.sehatq.com/public/materialPro/assets/plugins/sweetalert/sweetalert.min.js', 'https://dev.sehatq.com/public/materialPro/assets/plugins/sweetalert/jQuery.sweet-alert.custom.js'
    , 'https://dev.sehatq.com/public/js/moment.min.js', 'https://dev.sehatq.com/public/js/id.js', 'https://dev.sehatq.com/public/vendor/bootstrap4-datetimepicker-master/build/js/bootstrap-datetimepicker.min.js'
    , 'https://dev.sehatq.com/public/js/select2.min.js', 'https://dev.sehatq.com/public/vendor/slick/slick.min.js', 'https://dev.sehatq.com/public/js/jquery.slimscroll.min.js'
    , 'https://dev.sehatq.com/public/vendor/jScrollPane/script/jquery.mousewheel.js', 'https://dev.sehatq.com/public/vendor/jScrollPane/script/mwheelIntent.js'
    , 'https://dev.sehatq.com/public/vendor/jScrollPane/script/jquery.jscrollpane.min.js', 'https://dev.sehatq.com/public/vendor/ion.rangeSlider-2.2.0/js/ion-rangeSlider/ion.rangeSlider.min.js'
    , 'https://dev.sehatq.com/public/js/app.front.js?ts=1552457182']

while (WebUI.verifyElementPresent(findTestObject('penyakit/Page_Ablasi Retina  Definisi gejala/a_Penyakit Selanjutnya'), 
    30, FailureHandling.OPTIONAL) == true) {
    def uerel = []

    uerel += WebUI.getAllLinksOnCurrentPage(false, b)

    for (int x = 1; x < uerel.size; x++) {
        def z = []

        z += (uerel[x])

        if (WebUI.verifyLinksAccessible(z, FailureHandling.OPTIONAL) == true) {
        } else {
            CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('penyakit', i, 1, WebUI.getUrl())

            CustomKeywords.'writeToExcel.MultipleExcel.TargetExcel'('penyakit', i, 2, uerel[x])

            i++
        }
    }
    
    WebUI.click(findTestObject('penyakit/Page_Ablasi Retina  Definisi gejala/a_Penyakit Selanjutnya'))

    WebUI.waitForPageLoad(30)
}

if (WebUI.verifyAllLinksOnCurrentPageAccessible(false, b, FailureHandling.CONTINUE_ON_FAILURE) == true) {
} else {
    WebUI.comment(WebUI.getUrl())
}

WebUI.closeBrowser()

