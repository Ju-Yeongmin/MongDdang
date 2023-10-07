import { AppShell } from "src/components";
import { Outlet } from "react-router-dom";
import { AppHeader, AppNavBar } from "./components";
import { useEffect, useState } from "react";
import { usePageStoreState } from "src/stores/pageStore";

export const AppLayout = () => {
  const { currentPage } = usePageStoreState();

  const [isHeader, setIsHeader] = useState(false);

  useEffect(() => {
    if (currentPage === "" || currentPage === "메인") {
      setIsHeader(false);
    } else {
      setIsHeader(true);
    }
  }, [currentPage]);

  return (
    <>
      <AppShell
        navbar={<AppNavBar />}
        header={
          <AppHeader
            isHeader={isHeader}
            leftIcon={"<"}
            mainItem={currentPage}
            rightItem="관리"
          />
        }
      >
        <Outlet />
      </AppShell>
    </>
  );
};
